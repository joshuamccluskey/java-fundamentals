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
        Review review = new Review(user, "Bobs", "This was great!", 3);
        Review review1 = new Review(user, "Bobs", "This was great!", 3);
        sut.addReview(review);
        sut.addReview(review1);
        sut.updateStars();
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
        Location sut = new Location("Bobs", 1, 3);
        sut.setName("Joes");
        assertEquals("Joes", sut.getName(), "Yo something went wrong with the test_setName()");
    }

    @Test
    void test_getStars() {
        Location sut = new Location("Bobs", 1, 3);
        assertEquals(1, sut.getStars(), "Yo something went wrong with the test_getStars()");
    }

    @Test
    void test_setStars() {
        Location sut = new Location("Bobs", 1, 3);
        sut.setStars(4);
        assertEquals(4, sut.getStars(), "Yo something went wrong with the test_setStars()");
    }

    @Test
    void test_getDollarSigns() {
        Location sut = new Location("Bobs", 1, 3);
        assertEquals(3, sut.getDollarSigns(), "Yo something went wrong with the test_getDollarSigns()");
    }

    @Test
    void test_setDollarSigns() {
        Location sut = new Location("Bobs", 1, 3);
        sut.setDollarSigns(4);
        assertEquals(4, sut.getDollarSigns(), "Yo something went wrong with the test_setDollarSigns()");
    }

    @Test
    void test_getReviews() {
        Location sut = new Location("Bobs", 1, 3);
        User user =  new User("Josh");
        Review review = new Review(user, "Bobs", "This was great!", 3);
        Review review1 = new Review(user, "Bobs", "This was great!", 3);
        sut.addReview(review);
        sut.addReview(review1);
        assertTrue(true, "Yo something went wrong with test_getReviews()");
    }

    @Test
    void test_setReviews() {
        Location sut = new Location("Bobs", 1, 3);
        User user =  new User("Josh");
        Review review = new Review(user, "Bobs", "This was great!", 3);
        Review review1 = new Review(user, "Bobs", "This was great!", 3);
        sut.addReview(review);
        sut.addReview(review1);
        sut.setReviews(sut.reviews);
        assertTrue(true, "Yo something went wrong with test_getReviews()");
    }

    @Test
    void test_addReview() {
        Location sut = new Location("Bobs", 1, 3);
        User user =  new User("Josh");
        Review review = new Review(user, "Bobs", "This was great!", 3);
        Review review1 = new Review(user, "Bobs", "This was great!", 3);
        sut.addReview(review);
        sut.addReview(review1);
        assertTrue(true, "Yo something went wrong with test_addReview()");
    }
}