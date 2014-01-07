#include <stdlib.h>
#include <stdio.h>
#include <time.h>

void write_int(int i) {
	printf("%d", i);
}

void write_bool(int b) {
	if (b) printf("true");
	else printf("false");
}

void write_str(char* s) {
	printf("%s", s);
}

void write_arr(int* a) {
	printf("%p", (void*)a);
}

void write_nl() {
	printf("\n");
}

void read_int(int* i) {
	scanf("%d", i);
}

void seed() {
	srand(time(NULL));
}

