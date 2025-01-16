Here is the lab written in Markdown format:

```markdown
# Maven Lab: Using an External Dependency (Apache Commons Lang)

## Objective
In this lab, you will learn how to add and use an external dependency in your Maven project. Specifically, you will integrate the **Apache Commons Lang** library to perform common string manipulations in Java. This will teach you how to manage dependencies with Maven and use a well-documented, third-party library to solve real-world problems.

---

## Lab Instructions

### Part 1: Setting Up Your Maven Project

1. **Create a New Maven Project**:
   - Open **IntelliJ IDEA** (or your preferred IDE).
   - Create a new Maven project (use default settings).
   - Name your project `maven-lab`.
   
2. **Add the Dependency**:
   In the `pom.xml` file, add the following dependency inside the `<dependencies>` section to include the **Apache Commons Lang** library.

   ```xml
   <dependencies>
       <dependency>
           <groupId>org.apache.commons</groupId>
           <artifactId>commons-lang3</artifactId>
           <version>3.12.0</version>
       </dependency>
   </dependencies>
   ```

   - This will enable Maven to download and manage the Apache Commons Lang library for you.

### Part 2: Write the Application

1. **Create the Main Class**:
   Create a new class named `StringUtilsExample.java` under the `src/main/java` directory.

2. **Implement the Program**:
   In this class, use methods from the Apache Commons Lang library to manipulate a string. Below is an example to get you started:

   ```java
   import org.apache.commons.lang3.StringUtils;

   public class StringUtilsExample {
       public static void main(String[] args) {
           String input = "  Maven Lab Example  ";

           // Trim the string
           String trimmed = StringUtils.trim(input);
           System.out.println("Trimmed: '" + trimmed + "'");

           // Reverse the string
           String reversed = StringUtils.reverse(trimmed);
           System.out.println("Reversed: " + reversed);

           // Check if the string is empty
           boolean isEmpty = StringUtils.isEmpty(trimmed);
           System.out.println("Is Empty: " + isEmpty);

           // Capitalize the string
           String capitalized = StringUtils.capitalize(trimmed);
           System.out.println("Capitalized: " + capitalized);
       }
   }
   ```

3. **Run the Program**:
   - Run the `StringUtilsExample` class to see the output of the string manipulations.

---

### Part 3: Explore the Apache Commons Lang Documentation

- Go to the official [Apache Commons Lang Documentation](https://commons.apache.org/proper/commons-lang/apidocs/).
- Browse through the methods available in the `StringUtils` class.
- **Task**: Choose **two additional methods** that were not used in the example above and implement them in your program.

Examples of methods you might want to explore:
- `StringUtils.isNumeric(String str)`
- `StringUtils.join(String[] array, String separator)`
- `StringUtils.replaceChars(String str, char searchChar, char replaceChar)`

---

### Part 4: Writing Unit Tests

1. **Create a Test Class**:
   Create a new JUnit test class named `StringUtilsExampleTest.java` under the `src/test/java` directory.

2. **Write Unit Tests**:
   Write tests to validate the functionality of the methods in your `StringUtilsExample` class. Here's a starting point for your tests:

   ```java
   import org.apache.commons.lang3.StringUtils;
   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.*;

   class StringUtilsExampleTest {
       @Test
       void testTrim() {
           String input = "  Hello World  ";
           assertEquals("Hello World", StringUtils.trim(input));
       }

       @Test
       void testReverse() {
           String input = "Java";
           assertEquals("avaJ", StringUtils.reverse(input));
       }

       @Test
       void testIsEmpty() {
           assertTrue(StringUtils.isEmpty(""));
           assertFalse(StringUtils.isEmpty("text"));
       }
   }
   ```

3. **Run the Tests**:
   Run your JUnit tests to ensure that the methods are working correctly.

---

### Part 5: Deliverables

You need to submit the following:
1. **`pom.xml`** file with the correct dependency added.
2. **`StringUtilsExample.java`** file that demonstrates the string manipulations.
3. Implementation of **two additional methods** from the Apache Commons Lang documentation.
4. **JUnit Test Class (`StringUtilsExampleTest.java`)** with tests for your string manipulation methods.

---

## Learning Outcomes
- Understand how to manage external dependencies using Maven.
- Use the **Apache Commons Lang** library to simplify common string operations.
- Write unit tests to ensure your code works as expected.
- Practice reading and applying documentation to solve real-world problems.

---

Good luck, and have fun exploring Maven and Apache Commons Lang!
```

You can copy this markdown and use it as your lab instructions!