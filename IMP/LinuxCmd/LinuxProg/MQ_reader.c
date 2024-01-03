#include <sys/ipc.h>
#include <sys/msg.h>

#include <string.h>
#include <stdio.h>

struct msg_struct {
    long msg_type;
    char msg_text[1000];
};

int main() {
    key_t key = ftok("MQ_FD", 65);
    int mq_id = msgget(key, 0666);
    struct msg_struct message;
    message.msg_type = 1;

    ssize_t x = msgrcv(mq_id, &message, sizeof(message), 1, 0);
    printf("%s\n",message.msg_text);
    return 0;
}