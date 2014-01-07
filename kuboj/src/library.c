#include <stdlib.h>
#include <stdio.h>

int writeint(int a) {
    printf("%d", a);
    return 0;
}

int writestr(char *str) {
    printf("%s", str);
    return 0;
}

int writeintnl(int a) {
    printf("%d\n", a);
    return 0;
}

int writestrnl(char *str) {
    printf("%s\n", str);
    return 0;
}

int readint() {
    int i;
    scanf("%d", &i);
    return i;
}

int* mallocint(int n) {
    return (int *) malloc(sizeof(int) * n);
}