# Linux Installation

The way to install on linux very much depends on your platform. The
preferred way is to use a package manager which will keep the app up to date.

If you use AuthPass for Linux [please provide feedback](https://forum.authpass.app). Thanks!

## Snap Store

Especially for Ubuntu this might be the easiest way. Download from the Snap Store.


<center><a href="https://snapcraft.io/authpass" ><img alt="Get it from the Snap Store" src="https://snapcraft.io/static/images/badges/en/snap-store-black.svg" /></a></center>

## Flathub flatpak release

<center><a href="https://flathub.org/apps/details/app.authpass.AuthPass"><img width='240' alt='Download on Flathub' src='https://flathub.org/assets/badges/flathub-badge-en.png'/></a></center>

## Debian Apt repository

Debian package a distributed through an [apt repository on package.io](https://packagecloud.io/authpass/authpass)

```shell
# Add repository
curl -s https://packagecloud.io/install/repositories/authpass/authpass/script.deb.sh | sudo bash
# Install authpass
sudo apt-get install authpass
```

For details or manual installation check the [documentation on packagecloud.io](https://packagecloud.io/authpass/authpass/install#manual).

## Manual Downloads

* Download the latest `.tar.gz`: [![AuthPass-setup-stable.exe](https://data.authpass.app/data/artifact.download/authpass-linux-stable.deb/shield)](https://data.authpass.app/data/artifact.download/authpass-linux-stable.deb)
* Mirror: [available on FossHub](https://www.fosshub.com/AuthPass.html)
* [GitHub releases](https://github.com/authpass/authpass/releases)

!!! hint "Keep up to date"
   AuthPass is updated regularly. Please check regularly for updates.
   These provide regular updates, bugfixes and feature enhancements.
