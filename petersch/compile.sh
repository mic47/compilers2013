#!/bin/bash

IN=`readlink -f $1`
OUT=`readlink -f $2`

OLD=`pwd`
FILE=`readlink -f $0`
DIR=`dirname "$FILE"`
cd $DIR

java -cp build/classes:lib/antlr-4.1-complete.jar compiler.Compiler "$IN" > "$OUT"

cd $OLD
