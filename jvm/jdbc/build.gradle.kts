description = "Ballista JDBC Driver"
val arrowVersion : String by rootProject.extra
val flightGRPCVersion  : String by rootProject.extra

plugins {
    java
}

dependencies {

    implementation("org.apache.arrow:flight-core:${arrowVersion}")
    implementation("org.apache.arrow:flight-grpc:${flightGRPCVersion}")
}

tasks.test {
    //useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}
