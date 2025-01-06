import java.time.Instant

plugins {
    scala
    kotlin("jvm") version "2.1.0" apply false
    id("com.diffplug.spotless") version "5.0.0"
}

group = "io.andygrove.kquery.spark"
version = "0.4.0-SNAPSHOT"
description = "Ballista Spark Support"

val arrowVersion  by  extra {  "18.1.0" }
val flightGRPCVersion by  extra {  "15.0.2" }

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
    }
}

dependencies {
    implementation("org.scala-lang:scala-library:2.12.15")
}

subprojects {
    repositories {
        mavenLocal()
        mavenCentral()
    }

    apply {
        plugin("org.jetbrains.kotlin.jvm")
        plugin("com.diffplug.spotless")
        plugin("scala")
    }

    spotless {
        scala {
            scalafmt()
        }
    }

    val arrowVersion : String by rootProject.extra
    val flightGRPCVersion : String by rootProject.extra

    dependencies {
        implementation(kotlin("stdlib-jdk8"))
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
        implementation("org.jetbrains.kotlin:kotlin-reflect")

        implementation("org.rogach:scallop_2.12:5.2.0")

        // note that this project depends on the kotlin artifacts being published to a local maven repository
        // see ../jvm/README.md for instructions on publishing those artifacts
        implementation("io.andygrove.kquery:datatypes:0.4.0-SNAPSHOT")
        implementation("io.andygrove.kquery:datasource:0.4.0-SNAPSHOT")
        implementation("io.andygrove.kquery:logical-plan:0.4.0-SNAPSHOT")
        implementation("io.andygrove.kquery:protobuf:0.4.0-SNAPSHOT")
        implementation("io.andygrove.kquery:executor:0.4.0-SNAPSHOT")

        implementation("org.apache.arrow:flight-core:${arrowVersion}")
        implementation("org.apache.arrow:flight-grpc:${flightGRPCVersion}")

        implementation("org.apache.spark:spark-core_2.12:3.5.4")
        implementation("org.apache.spark:spark-sql_2.12:3.5.4")

        testImplementation("junit:junit:4.13")

    }

    tasks.jar {
        manifest {
            attributes(
                "Implementation-Title" to "${rootProject.name}-${archiveBaseName.get()}",
                "Implementation-Version" to rootProject.version,
                "Build-Timestamp" to Instant.now()
            )
        }
    }
}


