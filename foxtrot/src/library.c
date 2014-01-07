#include <stdlib.h>
#include <stdio.h>

int printInt(int a) {
    printf("%d", a);
    return 0;
}

int printString(char* a) {
    printf("%s", a);
    return 0;
}

int println() {
    printf("\n");
    return 0;
}

int readInt() {
    int i;
    scanf("%d", &i);
    return i;
}

int myExit() {
    exit(0);
    return 0;
}
