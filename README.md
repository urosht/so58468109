# Getting Started

1. Create an `application.properties` in your home directory with a value different than the one in `/src/main/resources/application.properties`.
2. Create a run configuration in your IDE (or build a jar) and run it with the following flag: `-Dspring.config.location=file:/full-path-to/your-home-dir/application.properties`.
3. Run the application and call `http://localhost:8080/getValue` to retrieve the value

Rerun the tests and replace the name of the folder with an environment variable.