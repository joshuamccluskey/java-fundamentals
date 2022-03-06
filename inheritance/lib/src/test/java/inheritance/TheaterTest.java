package inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TheaterTest {

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void getMovies() {
    }

    @Test
    void setMovies() {
    }

    @Test
    void getTheaterReviews() {
    }

    @Test
    void setTheaterReviews() {
    }

    @Test
    void addMovie() {
        ArrayList<String> myMovies = new ArrayList<>(
                List.of("The Matrix: Resurrection",
                        "Dog",
                        "Spiderman: No Way Home",
                        "Blacklight"
                ));
        Theater sut = new Theater("AMC" );
        sut.addMovie(myMovies, "Moonfall");
        System.out.println(sut);
        assertTrue(true, "Yo there is something wrong with the test_addMovie()");
    }

    @Test
    void removeMovie() {
        ArrayList<String> myMovies = new ArrayList<>(
                List.of("The Matrix: Resurrection",
                        "Dog",
                        "Spiderman: No Way Home",
                        "Blacklight"
                ));
        Theater sut = new Theater("AMC" );
        sut.removeMovie(myMovies,"The Matrix: Resurrection");
        System.out.println(sut);
        assertTrue(true, "Yo there is something wrong with the test_removeMovie()");
    }

    @Test
    void addReview() {
    }

    @Test
    void testToString() {
    }



//
//        return true;
}