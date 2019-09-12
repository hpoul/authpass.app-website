#!/bin/bash

args=""

if test -n "$@" ; then
    args="--args=\"$@\""
fi

./gradlew run ${args}
