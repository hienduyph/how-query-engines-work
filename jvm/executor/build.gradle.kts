description = "Ballista query executor"
val arrowVersion : String by rootProject.extra
val flightGRPCVersion : String by rootProject.extra

plugins {
    application
}

application {
    mainClass = "io.andygrove.kquery.executor.Executor"
}

dependencies {
    implementation(project(":datatypes"))
    implementation(project(":datasource"))
    implementation(project(":logical-plan"))
    implementation(project(":physical-plan"))
    implementation(project(":query-planner"))
    implementation(project(":sql"))
    implementation(project(":protobuf"))
    implementation(project(":execution"))

    implementation("org.apache.arrow:arrow-vector:${arrowVersion}")

    implementation("org.apache.arrow:flight-core:${arrowVersion}")
    implementation("org.apache.arrow:flight-grpc:${flightGRPCVersion}")
}
