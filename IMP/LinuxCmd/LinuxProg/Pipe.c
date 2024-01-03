#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

int main() {
   int pipe_fd[2]; // File descriptors for the pipe

   // Create the pipe
   if (pipe(pipe_fd) == -1) {
       perror("Pipe creation failed");
       exit(EXIT_FAILURE);
   }

   // Fork a child process
   pid_t pid = fork();

   if (pid == -1) {
       perror("Fork failed");
       exit(EXIT_FAILURE);
   }

   if (pid > 0) { // Parent process
       close(pipe_fd[0]); // Close the read end of the pipe in the parent

       // Write data to the pipe
       const char *message = "Hello from the parent process!";
       write(pipe_fd[1], message, strlen(message));

       close(pipe_fd[1]); // Close the write end of the pipe in the parent
   } else { // Child process
       close(pipe_fd[1]); // Close the write end of the pipe in the child

       // Read data from the pipe
       char buffer[100];
       ssize_t bytesRead = read(pipe_fd[0], buffer, sizeof(buffer));

       if (bytesRead == -1) {
           perror("Read from pipe failed");
           exit(EXIT_FAILURE);
       }

       buffer[bytesRead] = '\0'; // Null-terminate the string
       printf("Child process received: %s\n", buffer);

       close(pipe_fd[0]); // Close the read end of the pipe in the child
   }

   return 0;
}
