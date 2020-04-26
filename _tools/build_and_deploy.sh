#!/bin/bash

set -xeu

export DRY_RUN=${DRY_RUN:-}

dir="${0%/*}"
basedir="$dir/.."

cd $basedir

DC2F_ENV=production ./dc2f.sh build

if test -z "${DRY_RUN}" ; then
	./_tools/_deploy_web_sphene_net.sh

	./_tools/purge_cloudflare_cache.sh
fi


./_tools/gh-pages-deploy.sh


if test -z "${DRY_RUN}" ; then
	curl --silent --show-error http://www.google.com/webmasters/sitemaps/ping\?sitemap\=https://authpass.app/sitemap.xml | grep h2
fi

