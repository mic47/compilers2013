#!/bin/bash

OLD=`pwd`
FILE=`readlink -f $0`
DIR=`dirname "$FILE"`
cd $DIR

cd grammar
java -jar ../lib/antlr-4.1-complete.jar -visitor -o ../src/parser -package parser jazzik.g4
cd ..

mkdir -p build/classes/compiler/
mkdir -p build/classes/parser/

javac `find src/ -name \*.java` -d build/classes/

gcc -m32 -fPIC -std=c99 -shared include/helper.c -o include/helper.so

cd $OLD
