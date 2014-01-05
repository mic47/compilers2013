#!/bin/bash

if [ -L $0 ] ; then
    DIR=$(dirname $(readlink -f $0))
else
    DIR=$(dirname $0)
fi

pushd $DIR

cd grammar && java -jar ../lib/antlr-4.1-complete.jar kuboj.g4 -o ../src/ -visitor -no-listener && cd ..
mkdir -p bin/
javac src/*.java -d bin/
gcc -shared -fPIC -std=c99 src/library.c -o bin/library.so

popd $DIR
