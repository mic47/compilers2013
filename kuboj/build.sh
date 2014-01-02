#!/bin/bash

antlr4 grammar/kuboj.g4 -o src/ -visitor
mkdir -p bin/
javac src/*.java -d bin/
gcc -shared -fPIC -std=c99 src/library.c -o bin/library.so
