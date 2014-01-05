#!/bin/bash

if [ -L $0 ]; then
  DIR=$(dirname $(readlink -f $0))
else
  DIR=$(dirname $0)
fi 

pushd $DIR 2>&1 > /dev/null

lli-3.2 -load=./bin/library.so $1

popd $DIR 2>&1 > /dev/null
