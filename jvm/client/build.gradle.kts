description = "Ballista client"

val arrowVersion : String by rootProject.extra
val flightGRPCVersion : String by rootProject.extra

dependencies {

    implementation(project(":datatypes"))
    implementation(project(":datasource"))
    implementation(project(":logical-plan"))
    implementation(project(":protobuf"))

    implementation("org.apache.arrow:flight-core:${arrowVersion}")
    implementation("org.apache.arrow:flight-grpc:${flightGRPCVersion}")

}


tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}
