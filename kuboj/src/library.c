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

int writestr2(char *str, char *str2) {
    printf("%s", str);
    printf("%s", str2);
    return 0;
}