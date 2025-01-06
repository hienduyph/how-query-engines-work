val arrowVersion : String by rootProject.extra
plugins {
    kotlin("plugin.serialization")
    scala
}


dependencies {
    implementation(project(":datatypes"))
    implementation(project(":datasource"))
    implementation(project(":logical-plan"))
    implementation(project(":query-planner"))
    implementation(project(":optimizer"))
    implementation(project(":physical-plan"))
    implementation(project(":execution"))
    implementation(project(":sql"))

    implementation("org.apache.arrow:arrow-vector:${arrowVersion}")
}
