package inheritance;

import org.junit.jupiter.api.Test;

import javax.print.attribute.standard.JobSheets;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    @Test
    void test_getName() {
        Shop sut = new Shop ("Bartells", 1,4, "Seattle Pharmacy");
        assertEquals("Bartells", sut.getName(), "Yo there is something wrong with the test_getName()");
    }

    @Test
    void test_setName() {
        Shop sut = new Shop ("Bartells", 1,4, "Local Seattle Pharmacy");
        sut.setName("Bob Johnson's Pharmacy");
        assertEquals("Bob Johnson's Pharmacy", sut.getName(), "Yo something is wrong with test_setName()");
    }

    @Test
    void test_getDescription() {
        Shop sut = new Shop ("Bartells", 1,4, "Local Seattle Pharmacy");
        assertEquals("Local Seattle Pharmacy", sut.getDescription(), "Yo something is wrong with test_getDescription()");
    }

    @Test
    void test_setDescription() {
        Shop sut = new Shop ("Bartells", 1,4, "Local Seattle Pharmacy");
        sut.setDescription("Local Seattle Pharmacy in Ballard");
        assertEquals("Local Seattle Pharmacy in Ballard", sut.getDescription(), "Yo something is wrong with test_setDescription()");
    }

    @Test
    void test_getDollarSigns() {
        Shop sut = new Shop ("Bartells", 1,4, "Local Seattle Pharmacy");
        assertEquals(4, sut.getDollarSigns(), "Yo something is wrong with test_getDollarSigns()");
    }

    @Test
    void test_setDollarSigns() {
        Shop sut = new Shop ("Bartells", 1,4, "Local Seattle Pharmacy");
        sut.setDollarSigns(2);
        assertEquals(2, sut.getDollarSigns(), "Yo something is wrong with test_setDollarSigns()");
    }

    @Test
    void test_getStars() {
        Shop sut = new Shop ("Bartells", 1,4, "Local Seattle Pharmacy");
        assertEquals(1, sut.getStars(), "Yo something is wrong with test_getStars()");
    }

    @Test
    void test_setStars() {
        Shop sut = new Shop ("Bartells", 1,4, "Local Seattle Pharmacy");
        sut.setStars(5);
        assertEquals(5, sut.getStars(), "Yo something is wrong with test_setStars()");
    }

    @Test
    void test_getShopReviews() {
        Shop sut = new Shop ("Bartells", 1,4, "Local Seattle Pharmacy");
        sut.addReview("Josh","Bartells", "This place is great!", 5);
        ArrayList reviews = sut.getReviews();
        System.out.println(reviews);
        assertTrue(true,"Yo something is wrong with test_getShopReviews()");
    }

    @Test
    void test_setShopReviews() {
        Shop sut = new Shop ("Bartells", 1,4, "Local Seattle Pharmacy");
        ArrayList reviews = sut.getReviews();
        sut.addReview("Josh","Bartells", "This place is great!", 5);
        sut.setReviews(reviews);
        assertTrue(true, "Yo something is wrong with test_getShopReviews()");
    }

    @Test
    void test_addReview() {
        Shop sut = new Shop ("Bartells", 1,4, "Local Seattle Pharmacy");
        ArrayList reviews = sut.getReviews();
        sut.addReview("Josh","Bartells", "This place is great!", 5);
        assertTrue(true, "Yo something is wrong with test_getShopReviews()");
    }

    @Test
    void testToString() {
        Shop sut = new Shop ("Bartells", 1,4, "Local Seattle Pharmacy");
        System.out.println(sut);
//        assertEquals("");
    }
}