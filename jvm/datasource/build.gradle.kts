description = "Ballista data sources"
val arrowVersion : String by rootProject.extra
val hadoopVersion: String by rootProject.extra
val parquetVersion: String by rootProject.extra

dependencies {

    implementation(project(":datatypes"))

    implementation("org.apache.arrow:arrow-memory:${arrowVersion}")
    implementation("org.apache.arrow:arrow-memory-netty:${arrowVersion}")
    implementation("org.apache.arrow:arrow-vector:${arrowVersion}")

    implementation("org.apache.hadoop:hadoop-common:${hadoopVersion}")
    implementation("org.apache.hadoop:hadoop-mapreduce-client-core:${hadoopVersion}")
    implementation("org.apache.parquet:parquet-arrow:${parquetVersion}")
    implementation("org.apache.parquet:parquet-common:${parquetVersion}")
    implementation("org.apache.parquet:parquet-column:${parquetVersion}")
    implementation("org.apache.parquet:parquet-hadoop:${parquetVersion}")

    implementation("com.univocity:univocity-parsers:2.9.1")
}
