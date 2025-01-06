description = "Ballista logical query plan fuzzer utility"

val arrowVersion : String by rootProject.extra

dependencies {
    implementation(project(":datatypes"))
    implementation(project(":datasource"))
    implementation(project(":logical-plan"))

    implementation("org.apache.arrow:arrow-vector:${arrowVersion}")
}
