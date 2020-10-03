plugins {
    kotlin("jvm") version "1.4.10"
}

group = "club.chachy"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("io.ktor:ktor-client-core:1.3.2")
    implementation("io.ktor:ktor-client-gson:1.3.2")
    implementation("io.ktor:ktor-client-apache:1.3.2")

}



tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}
