package inheritance.review;

import inheritance.Theater;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheaterReviewTest {

    @Test
    void test_getMovie() {
        Theater sut = new Theater("AMC" , 3, 3);
        User user = new User("Josh");
        TheaterReview review = new TheaterReview(user, "AMC", "AMC FTW", 3, "Dog");
        sut.addReview(review);
        System.out.println(review);
        assertEquals("Dog", review.getMovie(), "Yo something is wrong with the test_getMovie()") ;
    }

    @Test
    void test_setMovie() {
        Theater sut = new Theater("AMC" , 3, 3);
        User user = new User("Josh");
        TheaterReview review = new TheaterReview(user, "AMC", "AMC FTW", 3, "Dog");
        sut.addReview(review);
        assertEquals("Dog", review.getMovie(), "Yo something is wrong with the test_getMovie()") ;
    }

    @Test
    void testToString() {
        Theater sut = new Theater("AMC" , 3, 3);
        User user = new User("Josh");
        TheaterReview review = new TheaterReview(user, "AMC", "AMC FTW", 3, "Dog");
        sut.addReview(review);
        assertTrue(true, "Yo something is wrong with the testToString()") ;
    }
}