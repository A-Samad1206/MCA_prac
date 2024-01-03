#include<stdio.h>
#include<stdlib.h>

#include<semaphore.h>
#include<pthread.h>

sem_t mySem;

void * thread_fun(void *arg) {
    sem_wait(&mySem);

    // Critical section

    sem_post(&mySem);
    return NULL;
}


int main() {
    sem_init(&mySem, 0, 1);

    pthread_t th1, th2;
    int id1 = 1, id2 = 2;

    pthread_create(&th1, NULL, thread_fun, (void*) &id1);
    pthread_create(&th2, NULL, thread_fun, (void*) &id2); 

    pthread_join(th1, NULL);
    pthread_join(th2, NULL);

    sem_destroy(&mySem);
    return 0;
}