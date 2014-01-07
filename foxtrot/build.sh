#!/bin/sh

CWD=$(pwd)
DIR=$(dirname $(readlink -f $0))
cd $DIR
cd grammar

java -jar ../lib/antlr-4.1-complete.jar foxtrot.g4 -o ../src/ -visitor

cd ..

javac -d bin/ src/*.java
gcc -shared -fPIC -std=c99 src/library.c -o bin/library.so

cd $CWD
