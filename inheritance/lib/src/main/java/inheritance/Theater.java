package inheritance;


import inheritance.reviewable.Reviewer;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    public static String name;
    public static ArrayList<String> movies;
    public static ArrayList<Object> theaterReviews;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Theater.name = name;
    }

    public static ArrayList<String> getMovies() {
        return movies;
    }

    public static void setMovies(ArrayList<String> movies) {
        Theater.movies = movies;
    }

    public static ArrayList<Object> getTheaterReviews() {
        return theaterReviews;
    }

    public static void setTheaterReviews(ArrayList<Object> theaterReviews) {
        Theater.theaterReviews = theaterReviews;
    }

    public Theater(String name) {
        this.name = name;
        this.movies = new ArrayList<>(List.of("The Matrix: Resurrection",
                "Dog",
                "Spiderman: No Way Home",
                "Blacklight"
        ));
        theaterReviews = new ArrayList<>();

    }

    public void addMovie (ArrayList<String> movies, String addedMovie){
        movies.add(addedMovie);
        this.movies = movies;
    }

    public void removeMovie (ArrayList<String> movies, String removedMovie){
        movies.remove(removedMovie);
        this.movies = movies;
    }


    public void addReview(String name, String body, String author, int rateStars) {
        Review newReview = new Review(name, body, author, rateStars);
        ArrayList reviews = getTheaterReviews();
        reviews.add(newReview);
        setTheaterReviews(reviews);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name=" + name +
                ", movies=" + movies +
                "}";
    }
}
