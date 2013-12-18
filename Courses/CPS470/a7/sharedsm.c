// Name: Kyle Head,	Class: cps470
// Assignment: a7	Due: Nov 4, 2013
// credit: 10 points
//
// Sharedsm.c implements the concept of a binary semaphore to
// ensure race conditions do not occur when writing to the shared
// resource stderr. The semaphore is implemented using the pipe
// system calls. Since reading from a pipe is a blocking call, if
// a read is placed before the critical region of the code then 
// only one process at a time will be able to enter. 

#include <errno.h>
#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>

int pipefd[2];

// The iSem function initilizes the semaphore by writing
// a 1 to the pipe. A 0 is returned on success and a -1 on
// failure. 
int iSem(void)
{
    if (write(pipefd[1], "1", 1) == -1) return -1;
    return 0;
}

// The function pSem performs the P operation of a semaphore.
// A read operation is performed and if a 1 is read from the
// pipe then a 0 is returned. If the read fails or a 1 is not
// returned then a -1 is returned instead. 
int pSem(void)
{
    int value;
    char val;
    if(read(pipefd[0], &val, 1) == -1) return -1;
    value = atoi(&val);
    if(value != 1) return -1;
    return 0;
}

// The vSem function writes a value of 1 to the pipe. if
// the write fails a -1 is returned. Otherwise a 1 is returned.
int vSem(void)
{
    if(write(pipefd[1], "1", 1) == -1) return -1;
    return 0;
}

// In the main function the program forks 30 processes that write 100
// lines to the shared resource stderr.
int main(int argc, char *argv[])
{
    pid_t cpid, wpid;
    int i, j;

    if (pipe(pipefd) == -1) {
        fprintf(stderr, "Pipe has failed!!\n");
	exit(1);
    }
    if(iSem() != 0) {
        fprintf(stderr, "Error initializing the semaphore!!\n");
        exit(1);
    } 
    for (i = 0; i < 30; i++) {
        cpid = fork();
        if (cpid < 0) {
            fprintf(stderr, "Fork has failed!!\n");
            exit(1);
        }
        else if(cpid == 0) {
	    if(pSem() != 0) {
                fprintf(stderr, "Error performing P operation!!\n");
		exit(1);
	    }
            for (j = 0; j < 100; j++) {
                fprintf(stderr, "[My pid: %d ]", (int) getpid());
            }
	    if(vSem() != 0) {
	        fprintf(stderr, "Error performing V operation!!\n");
		exit(1);
	    }
            exit(0);
        }
    }
    while(wpid = waitpid(-1, NULL, 0)) {
        if (errno == ECHILD) { break; }
    }
    close(pipefd[0]);
    close(pipefd[1]);
    puts(" ");
    exit(0);
}
