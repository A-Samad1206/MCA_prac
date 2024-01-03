#include<sys/ipc.h>
#include<sys/shm.h>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main() {
    
    key_t key = ftok("SH_M", 65);

    int shmid = shmget(key, 1024, 0666 | IPC_CREAT);

    if(shmid == -1) {
        perror("shmget");
        return -1;
    }

    char * str = (char*)shmat(shmid, NULL, 0);

    if(str == (void*)-1) {
        perror("shmat");
        return -1;
    }
    
    strcpy(str,  "Write to Shared Memory");

    shmdt(str);

    return 0;
}
