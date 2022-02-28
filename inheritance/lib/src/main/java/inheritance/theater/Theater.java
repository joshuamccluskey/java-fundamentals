package inheritance.theater;


import inheritance.reviewable.Reviewer;

import java.util.ArrayList;
import java.util.List;

public class Theater implements Reviewer {
    public static String name;
    public static ArrayList<String> movies;
    public static ArrayList<Object> theaterReviews;

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

    @Override
    public void addReview() {
        //TODO Build out add review method
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name=" + name +
                ", movies=" + movies +
                "}";
    }
}
