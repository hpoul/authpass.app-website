Store your Time-based One Time Tokens (TOTP) used for second factor
authentication directly in AuthPass.

Works similar to Google Authenticator, but your secret is stored in your
`kdbx` password keystore sharable across your devices.

<!--more-->

## Time-based One Time Tokens

Just like with Google Authenticator, when presented with a QR Code for your
2fa (2nd Factor Authentication) secret, simply scan it with the app by
selecting `Add Field` -> `One Time Token`.

{{render content=node.embed.figures.totpGif /}}

Afterwards the entry will have a field called `One Time Token` where you
see the time remaining for the current code as well as the code itself you
can use to authenticate with your service.

{{render content=node.embed.figures.totpScreenshot /}}


## Get AuthPass 1.4.0

{{render content=rootNode.embed.references.storeBadges /}}

* [Download on F-Droid](https://f-droid.org/en/packages/design.codeux.authpass.fdroid/)
* [Download Mac App from GitHub](https://github.com/authpass/authpass/releases/tag/v1.4.0)
* [Download Source Code from GitHub](https://github.com/authpass/authpass
)
