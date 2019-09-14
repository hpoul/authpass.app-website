#!/bin/bash

gradleArgs=""
args=""

echo "args: $@"

if test "$1" = "-t" ; then
  shift
  echo "setting gradle args. $@"
  gradleArgs="-t"
fi

if test -n "$@" ; then
    args="--args=\"$@\""
fi

DC2F_ARG0="$0" ./gradlew ${gradleArgs} run ${args}
