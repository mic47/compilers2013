#!/bin/sh

CWD=$(pwd)
DIR=$(dirname $(readlink -f $0))
INPUT=$(readlink -f $1)
OUTPUT=$(readlink -f $2)
cd $DIR

java -cp bin:lib/antlr-4.1-complete.jar Compiler < $INPUT > $OUTPUT

cd $CWD
