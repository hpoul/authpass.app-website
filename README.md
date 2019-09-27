# Website for [AuthPass - Password Manager](https://authpass.app/)

As deployed at https://authpass.app/ based on [DC2F](https://github.com/dc2f/dc2f.kt).

## Managing content/data types/templates

* Start server:
  > ./dc2f.sh -t serve
* Content: `web/content`
* Data Types: `src/main/kotlin/app/authpass/website`
* Templates: Right now does not contain customized templates.
  Based on [dc2f-common](https://github.com/dc2f/dc2f-common)

## Build production website

```
DC2F_ENV=production ./dc2f.sh build
```

## Deploying to https://authpass.app/

```bash
_tools/build_and_deploy.sh
```