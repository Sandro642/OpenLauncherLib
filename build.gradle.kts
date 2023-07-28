plugins {
    id("java")
}

group = "fr.theshark34.openlauncherlib"
version = "1.0.0"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.json:json:20190722")

}

tasks.test {
    useJUnitPlatform()
}