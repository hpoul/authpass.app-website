#!/bin/bash

set -xeu

dir="${0%/*}"
basedir="$dir/.."

cd $basedir

DC2F_ENV=production ./dc2f.sh build

./_tools/_deploy_web_sphene_net.sh

./_tools/purge_cloudflare_cache.sh

./_tools/gh-pages-deploy.sh


curl --silent --show-error http://www.google.com/webmasters/sitemaps/ping\?sitemap\=https://authpass.app/sitemap.xml | grep h2

