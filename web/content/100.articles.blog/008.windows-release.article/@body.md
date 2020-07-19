After the last AuthPass release added support for [Linux Desktop](/articles/linux-release/)
we are now also adding support for Windows! 🎉️

AuthPass 1.7.0 also includes UI improvements for group filter, fixes
for linux and more.

<!--more-->

## AuthPass 1.7.0 Changes

* Windows: Initial Windows Support 🎉️
* Improved group filter by showing recursive filter and trash.
* Password Entry: Only show "generate password" button if value is blank. #108
* Entry: Fix: Adding a custom field discards previous changes. #106
* WebDAV: Connect UI: Make dialog scrollable. #103
* WebDAV: Fixed Compatibility with servers returning trailing slashes for directories.
* WebDAV: Support for digest authentication (next to basic auth). #112
* Android: allow disabling of screenshots #100
* Linux: support for keyring storage (for Dropbox, Google Drive, WebDav, One Drive)

## Installation

{{render content=node.embed.figures.windowsScreenshot /}}

!!! success 'Windows Download'
    Download Windows Setup: [AuthPass-setup-1.7.1_1324.exe](https://data.authpass.app/data/artifacts/AuthPass-setup-1.7.1_1324.exe) 


!!! warning 'Experimental'
    AuthPass for Windows is still a bit experimental. If you try it out,
    please provide feedback. If you find bugs, file a new
    [bug report](https://github.com/authpass/authpass/issues).
    
    Make sure to **create backups for your password database**!
    
    Otherwise drop as a line on [Twitter](https://twitter.com/authpass) or
    [Facebook](https://facebook.com/authpass) to let us know that 
    everything is working.
    🤣️

## Improved Group Filter

We still keep working on the group/folder usability. Check out an improved
UI for filtering by groups with improved recycling bin support.

{{render content=node.embed.figures.groupFilter /}}


!!! note 'Let us know what you think!'
    If you try out AuthPass for Windows, let us know what you think!
    
    Drop as a line on [Twitter](https://twitter.com/authpass) or
    [Facebook](https://facebook.com/authpass) to let us know that 
    everything is working 🤣️, maybe also which Linux 
    version/distribution.
