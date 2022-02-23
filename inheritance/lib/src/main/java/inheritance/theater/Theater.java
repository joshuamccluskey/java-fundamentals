package inheritance.theater;


import java.util.ArrayList;

public class Theater {
    public static String name;
    public static ArrayList<String> movies = new ArrayList<>();

    public Theater(String name, ArrayList<String> movies) {
        this.name = name;
        this.movies = movies;
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
