With the new version of AuthPass 1.9.0 it is now possible to merge conflicts if you
modify the same kdbx file in parallel on two different devices. This ensures
that you don't lose any passwords, even if you use a cached version of your kdbx file while offline.

<!--more-->

## AuthPass 1.9.0 Changes

* Fixed null exception when copying username/password from entry which has none defined.
* Fixes #188 - Show banner to users to suggest activating autofill (@ATofighi)
* KDBX: Fix merging of files with incoming deleted objects.
* Add support for permanently deleting groups and password entries. #99
* When a conflict is detected during save, automatically merge files #80
* Dropbox: Fixed conflict detection.
* Google Drive: Implement rudimentary conflict detection #34

## Merging

{{render content=node.embed.figures.mergeConfirmation /}}

This is supported on **all cloud storage backends**. (Not for local files). 
When a change is saved and it is detected that the remote file was changed as 
well, a merge will be automatically initiated. As a user you will then see a 
merge message showing the incoming change.

Since this is a new feature, I would appreciate any feedback. If you happen 
to test this feature (preferably first on a backup password file), let me 
know in the forum at https://forum.authpass.app/ !

!!! success 'Get Involved!'
    Want to help out with the development of AuthPass? Any kind of support is appreciated.
    There is now a [contribution section in the Forum which lists many ways to
    help out](https://forum.authpass.app/c/contributors/contribute/13)! 
    <https://forum.authpass.app/c/contributors/contribute/13>
