plugins {
    java
    id("org.springframework.boot") version "3.5.5" apply false
    id("io.spring.dependency-management") version "1.1.7" apply false
}

group = "io.j2234"
version = "0.0.1-SNAPSHOT"
description = "Dmarket"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {

}

tasks.withType<Test> {
    useJUnitPlatform()
}
