#include<fcntl.h>
#include <stdio.h>

int main() {
    printf("Hello2");
    int fd = open("File.txt",O_RDWR | O_CREAT, S_IRUSR | S_IWUSR | S_IXUSR);

    printf("FD = %d",fd);

    if(fd == -1) {
        perror("fd");
    }

    return 0;
}