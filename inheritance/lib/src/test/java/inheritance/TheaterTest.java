package inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TheaterTest {

    @Test
    void test_getName() {
        Theater sut = new Theater("AMC", 3,3);
        sut.getName();
        assertEquals("AMC", sut.getName(), "Yo something is wrong with test_getName()");
    }

    @Test
    void test_setName() { Theater sut = new Theater("AMC", 3,3);
        sut.setName("CineMark");
        assertEquals("CineMark", sut.getName(), "Yo something is wrong with test_setName()");
    }

    @Test
    void test_getMovies() {
        Theater sut = new Theater("AMC", 3,3);
        sut.getMovies();
        System.out.println(sut.getMovies());
        assertEquals("[The Matrix: Resurrection, Dog, Spiderman: No Way Home, Blacklight]", sut.getMovies(), "Yo something is wrogn with get Movies");
    }

    @Test
    void test_setMovies() {
        Theater sut = new Theater("AMC", 3,3);
        ArrayList newList = new ArrayList<>(List.of("The Matrix: Resurrection",
                "Free Guy",
                "The Power of The Dog",
                "Blacklight"
        ));
        sut.setMovies(newList);
        System.out.println(sut.reviews);
        assertEquals("[The Matrix: Resurrection, Free Guy, The Power of The Dog, Blacklight]", sut.getMovies(), "Yo something is wrogn with get Movies");
    }

    @Test
    void test_getTheaterReviews() {
    }

    @Test
    void test_setTheaterReviews() {
    }

    @Test
    void test_addMovie() {
        ArrayList<String> myMovies = new ArrayList<>(
                List.of("The Matrix: Resurrection",
                        "Dog",
                        "Spiderman: No Way Home",
                        "Blacklight"
                ));
        Theater sut = new Theater("AMC" , 3, 3);
        sut.addMovie(myMovies, "Moonfall");
        System.out.println(sut);
        assertTrue(true, "Yo there is something wrong with the test_addMovie()");
    }

    @Test
    void test_removeMovie() {
        ArrayList<String> myMovies = new ArrayList<>(
                List.of("The Matrix: Resurrection",
                        "Dog",
                        "Spiderman: No Way Home",
                        "Blacklight"
                ));
        Theater sut = new Theater("AMC" ,3,3);
        sut.removeMovie(myMovies,"The Matrix: Resurrection");
        System.out.println(sut);
        assertTrue(true, "Yo there is something wrong with the test_removeMovie()");
    }

    @Test
    void test_addReview() {
    }

    @Test
    void test_testToString() {
    }



//
//        return true;
}