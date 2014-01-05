#!/bin/bash

if [ -L $0 ]; then
  DIR=$(dirname $(readlink -f $0))
else
  DIR=$(dirname $0)
fi 

java -cp $DIR/bin:$CLASSPATH Compiler $1 $2
