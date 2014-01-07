#!/bin/sh

CWD=$(pwd)
DIR=$(dirname $(readlink -f $0))
INPUT=$(readlink -f $1)
cd $DIR

lli -load=bin/library.so $INPUT

cd $CWD
