package inheritance;


import java.util.ArrayList;
import java.util.List;

public class Theater extends Location {
    public static ArrayList<String> movies;

    public Theater(String name, int stars, int dollarSigns ) {
       super(name, stars, dollarSigns );
        this.movies = new ArrayList<>(List.of("The Matrix: Resurrection",
                "Dog",
                "Spiderman: No Way Home",
                "Blacklight"
        ));

    }

    public static ArrayList<String> getMovies() {
        return movies;
    }

    public static void setMovies(ArrayList<String> movies) {
        Theater.movies = movies;
    }

    public void addMovie (ArrayList<String> movies, String addedMovie){
        movies.add(addedMovie);
        setMovies(movies);
    }

    public void removeMovie (ArrayList<String> movies, String removedMovie){
        movies.remove(removedMovie);
        setMovies(movies);
    }


    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", dollarSigns=" + dollarSigns +
                ", movies='" + movies +
                ", reviews='" + reviews + '\'' +
                "}";
    }
}
