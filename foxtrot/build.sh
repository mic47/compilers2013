#!/bin/sh

CWD=$(pwd)
DIR=$(dirname $(readlink -f $0))
cd $DIR

java -jar lib/antlr-4.1-complete.jar grammar/foxtrot.g4 -o src/ -visitor
javac -d bin/ src/*.java
gcc -shared -fPIC -std=c99 src/library.c -o bin/library.so

cd $CWD
