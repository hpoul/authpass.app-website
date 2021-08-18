The latest release of AuthPass includes an easy and seamless way to synchronize
your passwords between all your devices for free using AuthPass Cloud. 

<!--more-->

## Sign up for AuthPass Cloud

To make accessing your files easier and avoid abuse it is required to sign in with your email address.
If this is the first time to launch **AuthPass** you will be greeted with the following Welcome Screen:

{{render content=node.embed.figures.authPassWelcome /}}

Just go ahead and select *Yes, open my passwords* for now. This way you get to the default home screen.

{{render content=node.embed.figures.selectSource /}}

AuthPass offers a lot of ways to access your password databases. But the easiest way is to use *AuthPass Cloud*.
Select the button for *AuthPass Cloud*. If you have not authenticated before you will get the following screen:

{{render content=node.embed.figures.cloudAuth /}}

Now just tap the **Login** Button and enter your email address in the following screen.

{{render content=node.embed.figures.cloudSignUp /}}

After you entered your email address you will receive an email containing a link.
Keep the AuthPass app open on this screen in the background and open the email.
You do not have to open the email on the same device as you are using AuthPass. 

For example if you installed AuthPass on your smartphone you can just as well open
the email on your desktop app. You will be redirected to a website where you have
just confirm your email address by solving a captcha.

{{render content=node.embed.figures.confirmEmail /}}

After confirming your email address go back to AuthPass and you should already be
authenticated. In the next step AuthPass will load all your available password databases.

If you singed up new, you will not have any files so an empty list is displayed.

Now create a new file by pressing the <kbd>+</kbd> floating action button in the bottom right.

{{render content=node.embed.figures.fileList /}}

And now finally choose a secure master password for your databases. 
As always, this password is used to securely encrypt your whole password database 
on the client side. 

!!! warning "Remember your password"
    The server will never receive anything unencrypted and has no way
    to read your password database. So make sure to remember your password!

{{render content=node.embed.figures.choosePassword /}}

!!! warning "Use a secure password"
    The encryption is only as good as your master password. So be sure to use a
    secure password at all times.

Now you can create your passwords in this newly created password database. Every time
to save it, it will be synchronized into the *AuthPass Cloud*.

To open it on all your other devices, simply repeat the first steps to confirm
your email address. Afterwards you will see the password database and can open it
from all other devices.

!!! hint "Access in your browser"
    You can also open your files in every browser. Just head to
    <https://web.authpass.app/> and login the same way.

    If you access <https://web.authpass.app/> from a foreign computer, make sure to
    use an [incognito mode](https://support.google.com/chrome/answer/95464)! 
    This way nothing will remain in the browser. Otherwise, just log out of
    AuthPass Cloud.
