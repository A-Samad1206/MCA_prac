#include <fcntl.h>
#include <stdio.h>
#include <string.h>
#include <unistd.h>

int main() {
    printf("Hello1");
    int fd = open("File.txt",O_RDWR | O_CREAT, S_IRUSR | S_IWUSR);
    
    printf("FD = %d",fd);
    
    if(fd == -1) {
        perror("fd");
        return -1;
    }

    const char * buffer = "Hello World!";

    ssize_t bytes_write = write(fd, buffer, strlen(buffer));

    if(bytes_write == -1) {
        perror("write");
        return -1;
    }
    
    printf("Bytes write %ld \n", bytes_write);
    
    printf("String: %s \n",buffer);

    return 0;
}