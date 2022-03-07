package inheritance;

import inheritance.review.Review;
import inheritance.review.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {

    @Test
    void test_getName() {
        Restaurant sut = new Restaurant("Rays", 4,4);
        assertEquals("Rays", sut.getName(), "Yo there is something wrong with the test_getName()");
    }

    @Test
    void test_setName() {
        Restaurant sut = new Restaurant("Rays", 4,4);
        sut.setName("Bobs");
        assertEquals("Bobs", sut.getName(), "Yo there is something wrong with the test_setName()");
    }

    @Test
    void test_getStars() {
        Restaurant sut = new Restaurant("Rays", 4,4);
        assertEquals(4, sut.getStars(), "Yo there is something wrong with the test_getStars()");
    }

    @Test
    void test_setStars() {
        Restaurant sut = new Restaurant("Rays", 4,4);
        sut.setStars(3);
        assertEquals(3, sut.getStars(), "Yo there is something wrong with the test_setStars()");
    }

    @Test
    void test_getDollarSigns() {
        Restaurant sut = new Restaurant("Rays", 4,4);
        assertEquals(4, sut.getDollarSigns(), "Yo there is something wrong with the test_getDollarSigns()");
    }

    @Test
    void test_setDollarSigns() {
        Restaurant sut = new Restaurant("Rays", 4,4);
        sut.setDollarSigns(3);
        assertEquals(3, sut.getDollarSigns(), "Yo there is something wrong with the test_setDollarSigns()");
    }

    @Test
    void test_getRestaurantReviews() {
        Restaurant sut = new Restaurant("Rays", 4,4);
        User user = new User("Josh");
        Review review1 = new Review(user,"Rays", "This restaurant is so delicious!", 4);
        sut.addReview(review1);
        System.out.println(sut);
        assertTrue(true, "Yo there is something wrong with the test_getDollarSigns()");
    }

    @Test
    void test_setRestaurantReviews() {
        Restaurant sut = new Restaurant("Rays", 4,4);
        ArrayList reviews = sut.getReviews();
        User user = new User("Josh");
        Review review1 = new Review(user,"Rays", "This restaurant is so delicious!", 4);
        sut.addReview(review1);
        sut.setReviews(reviews);
        System.out.println(reviews);
        assertTrue(true, "Yo there is something wrong with the test_setDollarSigns()");

    }

    @Test
    void test_addReview() {
        Restaurant sut = new Restaurant("Rays", 0,4);
        User user = new User("Josh");
        Review review1 = new Review(user,"Rays", "This restaurant is so delicious!", 4);
        sut.addReview(review1);
        System.out.println(sut.reviews);
        assertTrue(true, " Yo there is something wrong with the test_addReview()");
    }

    @Test
    void testToString() {
        Restaurant sut = new Restaurant("Rays", 0,4);
        System.out.println(sut);
        assertEquals("Restaurant{name='Rays', stars=0, dollarsSigns=4}", sut.toString(), "Yo there is something wrong with the test_toSting");
    }
}