#include <stdio.h>
#include <signal.h>
#include <unistd.h>

void alarmHandler(int signum) {
    printf("Timer expired! Received signal %d (SIGALRM)\n", signum);
    // Your custom handling logic here
}

int main() {
    // Register a custom signal handler for SIGALRM
    signal(SIGALRM, alarmHandler);

    // Set an alarm for 5 seconds
    unsigned int remainingTime = alarm(5);

    printf("Alarm set. Waiting for %u seconds...\n", remainingTime);

    // Simulate a long-running task
    sleep(8);

    printf("Task completed.\n");

    return 0;
}
