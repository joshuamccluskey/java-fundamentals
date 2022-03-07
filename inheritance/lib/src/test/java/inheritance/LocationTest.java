package inheritance;

import inheritance.review.Review;
import inheritance.review.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {

    @Test
    void test_updateStars() {
        Location sut = new Location("Bobs", 1, 3);
        User user =  new User("Josh");
        Review review = new Review(user, "Bobs", "This was great!", 5);
        Review review1 = new Review(user, "Bobs", "This was great!", 3);
        sut.addReview(review);
        sut.addReview(review1);
        sut.updateStars();
        System.out.println(sut.stars);
        assertEquals(3,  sut.getStars(),"Yo something went wrong with the test_updateStars()");
    }

    @Test
    void test_getName() {
        Location sut = new Location("Bobs", 1, 3);
        sut.getName();
        assertEquals("Bobs", sut.getName(), "Yo something went wrong with the test_getName()");
    }

    @Test
    void test_setName() {
    }

    @Test
    void test_getStars() {
    }

    @Test
    void test_setStars() {
    }

    @Test
    void test_getDollarSigns() {
    }

    @Test
    void test_setDollarSigns() {
    }

    @Test
    void test_getReviews() {
    }

    @Test
    void test_setReviews() {
    }

    @Test
    void test_addReview() {
    }
}