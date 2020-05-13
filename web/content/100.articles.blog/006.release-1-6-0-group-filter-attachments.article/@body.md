Today we released AuthPass 1.6 with two new features making it easier to
organize your passwords.

1. Filter password list by groups.
2. Attach files to passwords entries.

<!--more-->

## Filter password list by groups

{{render content=node.embed.figures.filterGroups /}}

In the latest version we have improved how to interact with groups.
First, by default all passwords in your recycle bin group will be hidden.
You can easily show them from the app bar menu.

In addition, it is now possible to filter by a customized set of groups by 
selecting *Customize…* from the menu. This will bring up a list of all
groups in all currently open password files.

You can see the hierarchy by the indentation of each group item. To
**recursively filter by a group** just activate the checkbox. When
you are done tap the checkbox ✅️ at the top right.

## Attach files to password entries

Now you can easily store images or documents to your passwords. This
can be useful if you have something like offline TANs for your bank
account or other paper secrets. Or maybe a receipt from your services.

!!! note
    We recommend to keep attached files small. They are stored in the
    encrypted part of your kdbx database file. This might significantly 
    increase the time to encrypt/decrypt files as well as increase memory
    consumption.

## Get AuthPass 1.6.0

{{render content=rootNode.embed.references.storeBadges /}}

* [Download Mac App from GitHub](https://github.com/authpass/authpass/releases/tag/v1.4.0)
* [Download Source Code from GitHub](https://github.com/authpass/authpass)

