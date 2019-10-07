Synchronize your files using WebDAV to your OwnCloud, NextCloud or similar self hosted
cloud storages. On android use autofill service to automatically fill in usernames and passwords
into third party apps!

<!--more-->

## Android Autofill

By enabling integration with the Android Autofill service it is now possible to use AuthPass
as Autofill Provider in third party apps to easily fill in usernames and passwords.

{{render content=node.embed.figures.autofillGif /}}

To enable Autofill please head into the Preferences of AuthPass. It requires one time permissions.

**Note**: Autofill service is only supported on Android Oreo (9.0) and later!

## Support for OwnCloud, NextCloud, etc.

If you don't like to use proprietary cloud storage services like Google Drive or Dropbox 
there is good news: AuthPass **now supports WebDAV** out of the box. This allows you
to synchronize with OwnCloud, NextCloud or similar services.

To use WeDAV, simply select it as cloud storage provider when opening the password vault. 
After that you have to enter the Base URL for your cloud storage provider, for example
`https://nextcloud.example.com/remote.php/webdav`, your username and password.

These credentials will be stored securely on the device (just like access tokens for 
google drive and Dropbox). Afterwards you can browse through your WebDAV service and select
your existing Keepass file.

{{render content=node.embed.figures.saveIntoWebDav /}}

**If you do not yet have an existing Keepass file**, you can create a new password vault and
head over to the preferences and select 'Save As... WebDAV'


## Get AuthPass 1.2.1

{{render content=rootNode.embed.references.storeBadges /}}

* [Download on F-Droid](https://f-droid.org/en/packages/design.codeux.authpass.fdroid/)
* [Download Mac App from GitHub](https://github.com/authpass/authpass/releases/tag/v1.2.1)
* [Download Source Code from GitHub](https://github.com/authpass/authpass
)
