#!/bin/bash

IN=`readlink -f $1`

OLD=`pwd`
FILE=`readlink -f $0`
DIR=`dirname "$FILE"`
cd $DIR

lli -load=include/helper.so "$IN"

cd $OLD
