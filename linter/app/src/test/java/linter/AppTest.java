/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void test_linter() {
        App sut = new App();
        try {
            sut.linter("/Users/joshuamccluskey/projects/courses/401/java-fundamentals/linter/app/src/main/resources/gates.js");
        }
        catch (IOException e) {
            System.out.println("Please replace the file path to the absolute path of gates.js on your computer. " +
                    "Example: /Users/joshuamccluskey/projects/courses/401/java-fundamentals/linter/app/src/main/resources/gates.js");
            e.printStackTrace();

        }
        assertTrue(true, "Yo there is something wrong with test_linter()");
    }
    @Test void test_linter_error0() {
        App sut = new App();
        try {
            sut.linter("/Users/joshuamccluskey/projects/courses/401/java-fundamentals/linter/app/src/main/resources/error0.js");
        } catch (IOException e) {
            System.out.println("Please replace the file path to the absolute path of gates.js on your computer. " +
                    "Example: /Users/joshuamccluskey/projects/courses/401/java-fundamentals/linter/app/src/main/resources/gates.js");
            e.printStackTrace();
        }
        assertTrue(true, "Yo there is something wrong with test_linter_error0()");
    }

    @Test void test_linter_error1() {
        App sut = new App();
        try {
            sut.linter("/Users/joshuamccluskey/projects/courses/401/java-fundamentals/linter/app/src/main/resources/error1.js");
        } catch (IOException e) {
            System.out.println("Please replace the file path to the absolute path of gates.js on your computer. " +
                    "Example: /Users/joshuamccluskey/projects/courses/401/java-fundamentals/linter/app/src/main/resources/gates.js");
            e.printStackTrace();
        }
        assertTrue(true, "Yo there is something wrong with test_linter_error1()");
    }

    @Test void test_linter_errorFew5() {
        App sut = new App();
        try {
            sut.linter("/Users/joshuamccluskey/projects/courses/401/java-fundamentals/linter/app/src/main/resources/error5.js");
        } catch (IOException e) {
            System.out.println("Please replace the file path to the absolute path of gates.js on your computer. " +
                    "Example: /Users/joshuamccluskey/projects/courses/401/java-fundamentals/linter/app/src/main/resources/gates.js");
            e.printStackTrace();
        }
        assertTrue(true, "Yo there is something wrong with test_linter_errorFew5()");
    }
    @Test void test_linter_error10() {
        App sut = new App();
        try {
            sut.linter("/Users/joshuamccluskey/projects/courses/401/java-fundamentals/linter/app/src/main/resources/error10.js");
        } catch (IOException e) {
            System.out.println("Please replace the file path to the absolute path of gates.js on your computer. " +
                    "Example: /Users/joshuamccluskey/projects/courses/401/java-fundamentals/linter/app/src/main/resources/gates.js");
            e.printStackTrace();
        }
        assertTrue(true, "Yo there is something wrong with test_linter_error10()");
    }
    @Test void test_linter_errorNone() {
        App sut = new App();
        try {
            sut.linter("/Users/joshuamccluskey/projects/courses/401/java-fundamentals/linter/app/src/main/resources/errornone.js");
        } catch (IOException e) {
            System.out.println("Please replace the file path to the absolute path of gates.js on your computer. " +
                    "Example: /Users/joshuamccluskey/projects/courses/401/java-fundamentals/linter/app/src/main/resources/gates.js");
            e.printStackTrace();
        }
        assertTrue(true, "Yo there is something wrong with test_linter_errorNone()");
    }
}
