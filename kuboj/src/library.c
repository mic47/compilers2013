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

int writestrint(char *str, int a) {
    printf("%s\n", str);
    printf("%d\n", a);
    return 0;
}