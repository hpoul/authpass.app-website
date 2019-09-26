#!/bin/bash

set -xeu

dir="${0%/*}"
basedir="$dir/.."

cd $basedir

./dc2f.sh build

./_tools/_deploy_web_sphene_net.sh

