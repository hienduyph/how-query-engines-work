description = "Ballista protocol buffer format"
val arrowVersion : String by rootProject.extra
val protobufVersion = "4.29.2"

plugins {
    java
    id("com.google.protobuf") version "0.9.4"
    id("idea")
}


sourceSets {
    main {
        proto {
            srcDir("../../proto")
        }
        java{
            srcDir("build/generated/proto/main/java")
        }
    }
}

dependencies {

    implementation(project(":datatypes"))
    implementation(project(":datasource"))
    implementation(project(":logical-plan"))
    implementation(project(":physical-plan"))

    implementation("org.apache.arrow:arrow-memory:${arrowVersion}")
    implementation("org.apache.arrow:arrow-vector:${arrowVersion}")
    implementation("com.google.protobuf:protobuf-java:${protobufVersion}")
}
