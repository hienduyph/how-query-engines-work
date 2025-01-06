description = "Ballista SQL query planner"
val arrowVersion : String by rootProject.extra

dependencies {
    implementation(project(":datatypes"))
    implementation(project(":datasource"))
    implementation(project(":logical-plan"))

    implementation("org.apache.arrow:arrow-vector:${arrowVersion}")
}
