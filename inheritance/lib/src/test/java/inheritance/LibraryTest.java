/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void test_newRestaurant() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.newRestaurant(), "Yo you need to look over newRestaurant");
    }

    @Test void test_newReview() {
        Library sut = new Library();
        assertTrue(sut.newReview(), "Yo you need to look over newReview");
    }
}
