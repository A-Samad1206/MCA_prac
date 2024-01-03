#include<stdio.h>
#include<stdlib.h>

#include<semaphore.h>
#include<pthread.h>

sem_t mySem;

void * thread_fn(void *arg) {
    sem_wait(&mysem);

    // Critical Section

    sem_post(&mySem);
}


int main(){
    
    sem_init(&mySem, 0, 1);
    pthread th1,th2;

    int id1=1,id2=2;

    pthread_create(&th1, NULL, thread_fn, (void*)&id1);
    pthread_create(&th2, NULL, thread_fn, (void*)&id2);
    
    pthread_join(th1, NULL);
    pthread_join(th2, NULL);    

    sem_destory(&mySem);

    return 0;
}