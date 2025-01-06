description = "Ballista query execution"
val arrowVersion : String by rootProject.extra

plugins {
    kotlin("plugin.serialization")
}

dependencies {
    implementation(project(":datatypes"))
    implementation(project(":datasource"))
    implementation(project(":logical-plan"))
    implementation(project(":physical-plan"))
    implementation(project(":query-planner"))
    implementation(project(":optimizer"))
    implementation(project(":sql"))
    implementation(project(":fuzzer"))

    implementation("org.apache.arrow:arrow-vector:${arrowVersion}")
}
