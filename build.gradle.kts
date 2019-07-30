plugins {
    java
    application
    id("com.github.johnrengelman.shadow") version "5.1.0"
}

repositories {
    mavenCentral()
}

dependencies {
    compile("com.google.code.gson:gson:2.8.5")
    compile("net.lingala.zip4j:zip4j:2.1.1")
}

application {
    mainClassName = "vazkii.cmpdl.CMPDL"
}
