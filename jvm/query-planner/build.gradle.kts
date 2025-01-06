description = "Ballista query planner"
val arrowVersion : String by rootProject.extra

plugins {
    kotlin("plugin.serialization")
}

dependencies {

    implementation(project(":datatypes"))
    implementation(project(":datasource"))
    implementation(project(":logical-plan"))
    implementation(project(":physical-plan"))
    implementation(project(":optimizer"))

    implementation("org.apache.arrow:arrow-memory:${arrowVersion}")
    implementation("org.apache.arrow:arrow-vector:${arrowVersion}")
}
