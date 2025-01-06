plugins {
    kotlin("plugin.serialization")
}
val arrowVersion : String by rootProject.extra

dependencies {

    implementation(project(":datatypes"))
    implementation(project(":datasource"))
    implementation(project(":logical-plan"))
    implementation(project(":fuzzer"))

    implementation("org.apache.arrow:arrow-memory:${arrowVersion}")
    implementation("org.apache.arrow:arrow-vector:${arrowVersion}")
}
