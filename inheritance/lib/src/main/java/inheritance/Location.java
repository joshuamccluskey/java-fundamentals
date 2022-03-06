package inheritance;

import java.util.ArrayList;

public class Location {
    public static String name;
    public static int stars;
    public static int dollarSigns;
    public static ArrayList<Object> reviews;

    @Override
    public String toString() {
        return "Destination{}";
    }

    public Location(String name, int stars, int dollarSigns) {
        this.name = name;
        this.stars = stars;
        this.dollarSigns = dollarSigns;
        reviews = new ArrayList<>();
    }


    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Location.name = name;
    }

    public static int getStars() {
        return stars;
    }

    public static void setStars(int stars) {
        Location.stars = stars;
    }

    public static int getDollarSigns() {
        return dollarSigns;
    }

    public static void setDollarSigns(int dollarSigns) {
        Location.dollarSigns = dollarSigns;
    }

    public static ArrayList<Object> getReviews() {
        return reviews;
    }

    public static void setReviews(ArrayList<Object> reviews) {
        Location.reviews = reviews;
    }

    public void addReview(String author, String name , String body,  int rateStars) {
        int sum;
        Review newReview = new Review(name, body, author, rateStars);
        ArrayList reviews = this.getReviews();
        if (this.name.equals(this.getName())){
            reviews.add(newReview);
            this.setReviews(reviews);
        }else{
            System.out.println("This restaurant is not available");
        }


    }

}
