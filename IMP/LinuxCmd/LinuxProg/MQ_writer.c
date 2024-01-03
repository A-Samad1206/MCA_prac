#include <sys/ipc.h>
#include <sys/msg.h>
#include<stdlib.h>
#include<stdio.h>
#include <string.h>

struct msg_struct {
    long msg_type;
    char msg_text[1000];
};

int main() {
    key_t key = ftok("MQ_FD", 65);
    if(key == -1) {
        perror("ftok");
        exit(EXIT_FAILURE);
    }

    int mq_id = msgget(key, 0666 | IPC_CREAT);

    if(mq_id == -1) {
        perror("msgget");
        exit(EXIT_FAILURE);
    }
    struct msg_struct message;
    
    message.msg_type = 1;
    
    strcpy(message.msg_text, "Hello wordl");

    msgsnd(mq_id, &message, sizeof(message), 0);
    
    return 0;
}