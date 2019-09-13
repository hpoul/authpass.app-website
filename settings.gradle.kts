rootProject.name = "authpass.app-site"

//include("dc2f")
//project(":dc2f").projectDir = file("deps/dc2f.kt")

includeBuild("../dc2f.kt")
includeBuild("../dc2f-common")
includeBuild("../dc2f-edit-api") {

//    dependencySubstitution {
//        substitute(module("com.dc2f:dc2f")).with(project(":authpass.app-site:dc2f"))
//    }
}

