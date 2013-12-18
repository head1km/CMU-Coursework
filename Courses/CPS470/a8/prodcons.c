// Name: Kyle Head	Class: cps470
// Assignment: A8	Due: December 2, 2013
// Credit: 20 points
//
// A8 is a program written to simulate a bounded
// buffer. The program consists of two binary
// semaphores and a mutex, which control access
// to the buffer in question. Only one producer
// or consumer is allowed access to the buffer at
// any given time, or else segmentation faults could
// occur. 

#include <pthread.h>
#include <semaphore.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <unistd.h>
#define max 300

const char* const values = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
char buffer[max];
int counter;
sem_t full, empty;
pthread_mutex_t mtx;

void startSemaphore();
void die(char *msg);
void *producer(void *ptr);
void *consumer(void *ptr);
int qinsert(char letter);
int qremove();

// The die function is called whenever an
// error occurs. The function prints out a
// message, char *msg, and then exits the 
// program completely.
void die(char *msg)
{
    fprintf(stderr, "%s\n", msg);
    exit(1);
}

// The function startSemaphore() is called
// to initialize the mutex and semaphores 
// needed to control access to the buffer,
// as well as the counter variable used to
// keep track of where in the buffer the 
// program is currently accessing.
void startSemaphore()
{
    pthread_mutex_init(&mtx, NULL);
    sem_init(&full, 1, 0);
    sem_init(&empty, 1, 1);
    counter = 0;
}

// The function producer is passed to
// a thread for it's implementation. The
// function calls the qinsert() function
// to add characters to the buffer. This
// insert is performed inside of the semaphore
// so that it is an atomic action. 
void *producer(void *param)
{
    int iters = *(int *)param;
    char c;
    
    srand(time(NULL));
    while (iters > 0) {
        c = values[rand() %26];
        sem_wait(&empty);
        pthread_mutex_lock(&mtx);
        if (qinsert(c)) {
            fprintf(stderr, "Error inserting\n");
        }
        else {
            fprintf(stderr, "%d producer placed %c in buffer.\n", (int)pthread_self(), c);
        }
        pthread_mutex_unlock(&mtx);
        sem_post(&full);
        iters--;
    }
    pthread_exit(0);
}

// The consumer function is passed to a thread to perform
// it's functions. Inside of the thread the consumer function 
// pops characters off of the buffer. This is performed inside of
// a semaphore so that no errors will occur. 
void *consumer(void *param)
{
    int iters = *(int *)param;
    char c;
    
    while (iters > 0) {
        sem_wait(&full);
        pthread_mutex_lock(&mtx);
        if (qremove(&c)) {
            fprintf(stderr, "Error consuming\n");
        }
        else {
            fprintf(stderr, "%d consumer removed %c from buffer.\n", (int)pthread_self(), 
c);
        }
        pthread_mutex_unlock(&mtx);
        sem_post(&empty);
        iters--;
    }
    pthread_exit(0);
}

// The qinsert function adds a character value
// to the buffer and increments the counter variable. 
// On success it will return 0, and on failure a -1 is
// returned. 
int qinsert(char letter)
{
    if (counter < max) {
        buffer[counter] = letter;
        counter++;
        return 0;
    }
    else {
        return -1;
    }
}

// The qremove function pops a value off of the 
// buffer, and decrements the counter variable. On
// success the funciton returns 0, and on failure 
// the function returns -1.
int qremove(char *letter)
{
    if (counter > 0) {
        *letter = buffer[counter - 1];
        counter--;
        return 0;
    }
    else {
        return -1;
    }
}

// The main function takes in arguments from the command
// line. The arguments are: the number of producers, the
// number of times the producers are iterated, the number
// of consumers, and the number of times the consumers are
// iterated. The function then ensures that the producers 
// and consumers, multiplied by their respective iterations, 
// are of an equal value. If so the function will initialize
// threads for the producers and consumers as well as the 
// mutex and semaphore variables. Finally the main function
// will wait for the threads to exit before closing the program.
int main(int argc, char **argv)
{
    int nprods, proditers, ncons, consiters, i, threads;
    pthread_t ids[max];
    
    nprods = atoi(argv[1]);
    proditers = atoi(argv[2]);
    ncons = atoi(argv[3]);
    consiters = atoi(argv[4]);
    threads = 0;
    
    if (nprods * proditers == ncons * consiters) {
        startSemaphore();
        for (i = 0; i < ncons; i++) {
            if (pthread_create(&ids[i], NULL, consumer, &consiters) != 0)
                die("Consumer: pthread_create");
            threads++;
        }
        for (i = 0; i < nprods; i++) {
            if (pthread_create(&ids[i+ncons], NULL, producer, &proditers) != 0)
                die("Producer: pthread_create");
        }
        for (i = 0; i < (threads * 2); i++) {
            pthread_join(ids[i], NULL);
        }
        pthread_mutex_destroy(&mtx);
        sem_destroy(&full);
        sem_destroy(&empty);
    }
    else
    {
        die("Producers and Consumers are not equal!!!");
    }
    exit(0);
}
