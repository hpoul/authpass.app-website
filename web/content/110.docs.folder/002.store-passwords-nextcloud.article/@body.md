If you are not comfortable reliant on a third party hosting provider
like Google Drive or Dropbox you can use WebDAV to either host it on
your own or use a local provider to sync your password file
across all your devices.

# NextCloud / OwnCloud account

If you do not yet have a [NextCloud](https://nextcloud.com) server account, 
check out <https://nextcloud.com/signup/> which provides an easy way
to find a local provider for a free NextCloud service.

# Finding your WebDAV URL

AuthPass uses WebDAV to communicate with your NextCloud instance.

!!! cite "WebDAV"
    Web Distributed Authoring and Versioning (WebDAV) is an open protocol
    which adds simple file management operations on top of HTTP.
    
    [Read more on Wikipedia...](https://en.wikipedia.org/wiki/WebDAV)

AuthPass requires the endpoint used in your NextCloud account. To find
it log in to your NextCloud web UI and click "Settings" in the bottom left
corner of your NextCloud UI. When opening on a mobile device it is under the
Burger menu/Drawer:

{{render content=node.embed.figures.webdavMobile/}}

Select the full URL and copy it.

# Opening a file from WebDAV in AuthPass

Launch AuthPass to get to the "Load from WebDAV" dialog and "Login To WebDAV".
Now you will see the following dialog:

{{render content=node.embed.figures.webdavSettings/}}

And fill out the form as described:

* Url: The WebDAV URL copied in the previously. For example:\
  `https://nextcloud03.webo.hosting/remote.php/dav/files/`
* Username: The username you use to login to your NextCloud.
* Password: Your password for this user.

Press **Ok** to continue and login to your WebDAV account.

!!! warning "Note"
    Please make sure that you use the **exact** URL as shown in the
    settings dialog of NextCloud. It might differ from the example.
    
    For example it could include a different path, or include your
    account name.

# Select your kdbx file.

If your login works correctly you will see a list of all folder and files in
your root directory.

{{render content=node.embed.figures.webdavBrowser/}}

Now you can navigate by tapping on your sub folders to locate your `kdbx` file.

# Creating a new password database file.

If you do not yet have a kdbx file stored in your NextCloud drive
you can start from scratch.

On the initial screen of AuthPass select **"New to Keepass? Create a new Password Database"**.
Now you will be prompted to enter a database name and your Master Password.

!!! important
    Make sure to create a memorable, but secure Master Password. Maybe choose
    a password phrase with multiple words which is still easy to remember.

After creating your new file you will see your fresh, empty, password list.
From here you can manage your passwords, create new ones, etc.

To store your passwords in your NextCloud open the AppBar menu and tap on
the newly created password file.

{{render content=node.embed.figures.appbarMenu/}}

This will open the settings for your password database. To change how
your password file is stored select the overflow menu from the "Path" row.

It will show you different storage backends you can use to save your password database to.

{{render content=node.embed.figures.kdbxStorage/}}

You can now select to store your passwords into NextCloud by choosing "WebDAV".
If you have not yet configured your WebDAV storage you will get a settings
dialog where you have to enter WebDAV URL and username and password. 
See the beginning of this page on how to find your WebDAV url and configure
everything.

After successfully logging in you can choose a new location for your kdbx file.
Once you have confirmed the location AuthPass will copy your password database
into the specified location and reopen it.

!!! success
    Congratulations, you have successfully saved your kdbx database files into
    your own NextCloud instance.

If you have any problems during this process, don't hesitate to [contact us](/docs/contact)!
