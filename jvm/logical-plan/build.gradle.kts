description = "Ballista logical plan"
val arrowVersion : String by rootProject.extra

dependencies {
    implementation(project(":datatypes"))
    implementation(project(":datasource"))

    implementation("org.apache.arrow:arrow-memory:${arrowVersion}")
    implementation("org.apache.arrow:arrow-vector:${arrowVersion}")

}
