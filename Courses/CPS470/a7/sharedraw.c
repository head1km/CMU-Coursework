// Name: Kyle Head	Class: cps470
// Assignment: a7	Due: Nov 4, 2013
// Credit: 10
//
// Sharedraw.c forks 30 processes that write to the
// shared resource stderr. The purpose of this program
// is to cause a race condition to appear by having the
// output interleave. 
// Output becomes interleaved when 2 is entered as the
// argument value.

#include <errno.h>
#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>

// In the main function the program forks 30 processes
// that will write 100 times to the shared resource stderr.
int main(int argc, char *argv[])
{
    pid_t cpid, wpid;
    int i, j;

    for (i = 0; i < 30; i++) {
        cpid = fork();
        if (cpid < 0) {
            fprintf(stderr, "Fork has failed!!\n");
            exit(1);
        }
        else if(cpid == 0) {
            for (j = 0; j < 100; j++) {
                fprintf(stderr, "[My pid: %d ]", (int) getpid());
            }
            exit(0);
        }
    }
    while(wpid = waitpid(-1, NULL, 0)) {
        if (errno == ECHILD) { break; }
    }
    puts(" ");
    exit(0);
}
