description = "Ballista data types"
val arrowVersion : String by rootProject.extra

dependencies {
    implementation("org.apache.arrow:arrow-memory:${arrowVersion}")
    implementation("org.apache.arrow:arrow-vector:${arrowVersion}")

    testImplementation("org.apache.arrow:arrow-memory-netty:${arrowVersion}")
}
