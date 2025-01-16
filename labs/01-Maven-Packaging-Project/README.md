# Lab: Maven Packaging and Validation

## Objective
In this lab, you will validate whether your previous banking application project is a Maven project. If it is not, you will create a new Maven project replicating the same functionality. Finally, you will package your project using Maven and prepare it for use as a dependency in the next lab.

## Prerequisites
- A completed banking application project from your earlier assignment.
- A basic understanding of Maven and its dependencies.

---

## Instructions

### Step 1: Validate Your Project
1. **Check if the Project is a Maven Project**:
   - Navigate to the root directory of your banking application project.
   - Run the following command to validate if it is a Maven project:
     ```bash
     mvn validate
     ```
   - If the validation succeeds without errors and the project contains a `pom.xml` file, proceed to Step 3.

### Step 2: Create a Maven Project (If Needed)
1. **Create a new Maven Project**:
   - Replace `com.example.banking` with your desired group ID and `banking-app` with your desired artifact ID.

2. **Copy Your Classes and Functionality**:
   - Move the Java classes and functionality from your original project into the appropriate directories in the Maven project structure:
     - Place Java source files in the `src/main/java` directory.
     - Place test files (if You have some) in the `src/test/java` directory.
   - Update the `pom.xml` file with any necessary dependencies required for your project to compile and run.

3. **Verify the New Project**:
   - Run `mvn validate` in the root of the new Maven project to ensure everything is set up correctly.

### Step 3: Package Your Maven Project
1. **Compile and Package**:
   - Use the following Maven command to compile and package your project:
     ```bash
     mvn install
     ```
   - This will build the project and install the resulting `.jar` file in your local Maven repository.

2. **Verify the Output**:
   - Confirm that the `.jar` file has been generated and stored in the `target` directory of your project.
   - Check your local Maven repository (usually located in `~/.m2/repository`) to ensure your project has been installed there.

### Step 4: Prepare for the Next Lab
1. **Take Note of Artifact Details**:
   - Record the `groupId`, `artifactId`, and `version` defined in your `pom.xml` file. These will be used as a dependency in the next lab.
