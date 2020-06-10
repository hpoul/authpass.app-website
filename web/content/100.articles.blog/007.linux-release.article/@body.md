AuthPass can finally run natively on Linux Desktops. This
brings all Password Manager features from our Android, iOS and 
MacOS app finally to Linux 🎉️ 🐧️ 

<!--more-->

## Installation

{{render content=node.embed.figures.ubuntuScreenshot /}}

There are basically two ways to install right now. Either
manually downloading the .tar.gz or, if you are using Ubuntu
you can [install our PPA using Deb](https://launchpad.net/~codeux.design/+archive/ubuntu/authpass).


!!! warning 'Experimental'
    AuthPass for Linux is still a bit experimental. If you try it out,
    please provide feedback. If you find bugs, file a new
    [bug report](https://github.com/authpass/authpass/issues).
    
    Make sure to **create backups for your password database**!
    
    Otherwise drop as a line on [Twitter](https://twitter.com/authpass) or
    [Facebook](https://facebook.com/authpass) to let us know that 
    everything is working.
    🤣️

### Requirements

* Only available for amd64 (ie. 64 bit Linux).
* Requires X11, GTK, etc.

### Ubuntu

You can simply use the released PPA from:
<https://launchpad.net/~codeux.design/+archive/ubuntu/authpass>

Simply use the following commands:

```shell script
sudo add-apt-repository ppa:codeux.design/authpass
sudo apt-get update
sudo apt-get install authpass
```

This will install a `AuthPass` entry as desktop menu entry as well as a
`authpass` command in `/usr/bin/authpass`

### Other Linux Distributions

Just head to the [Releases on GitHub](https://github.com/authpass/authpass/releases)
and download the Linux .tar.gz file.

Right now this is the 1.6.3 release: <https://github.com/authpass/authpass/releases/tag/v1.6.3>

* Download `authpass-linux-1.6.3_1201.tar.gz`
* Extract .tar.gz:
  ```
  > tar xzf authpass-linux-1.6.3_1201.tar.gz
  ```
* Launch authpass/authpass:
  ```
  authpass/authpass
  ```

!!! note 'Let us know what you think!'
    If you try out AuthPass for Linux, let us know what you think!
    
    Drop as a line on [Twitter](https://twitter.com/authpass) or
    [Facebook](https://facebook.com/authpass) to let us know that 
    everything is working 🤣️, maybe also which Linux 
    version/distribution.
