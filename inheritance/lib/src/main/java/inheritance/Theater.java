package inheritance;


import inheritance.reviewable.Review;

import java.util.ArrayList;
import java.util.List;

public class Theater extends Location {
    public static String name;
    public static ArrayList<String> movies;
    public static ArrayList<Object> theaterReviews;





    public static void setTheaterReviews(ArrayList<Object> theaterReviews) {
        Theater.theaterReviews = theaterReviews;
    }

    public Theater(String name, int stars, int dollarSigns ) {
       super(name, stars, dollarSigns );
        this.movies = new ArrayList<>(List.of("The Matrix: Resurrection",
                "Dog",
                "Spiderman: No Way Home",
                "Blacklight"
        ));
        theaterReviews = new ArrayList<>();

    }

    public static ArrayList<String> getMovies() {
        return movies;
    }

    public static void setMovies(ArrayList<String> movies) {
        Theater.movies = movies;
    }

    public void addMovie (ArrayList<String> movies, String addedMovie){
        movies.add(addedMovie);
        this.movies = movies;
    }

    public void removeMovie (ArrayList<String> movies, String removedMovie){
        movies.remove(removedMovie);
        this.movies = movies;
    }


    @Override
    public String toString() {
        return "Theater{" +
                "name=" + name +
                ", movies=" + movies +
                "}";
    }
}
