package inheritance;

import inheritance.review.Review;
import inheritance.review.Reviewable;

import java.util.ArrayList;

public class Location implements Reviewable {
    public static String name;
    public static int stars;
    public static int dollarSigns;
    public static ArrayList<Review> reviews;

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

    public static ArrayList<Review> getReviews() {
        return reviews;
    }

    public static void setReviews(ArrayList<Review> reviews) {
        Location.reviews = reviews;
    }


    public void addReview(Review review) {
        //Checks if User already has a review if they don't it adds their review
        if (!reviews.contains(null)){
            for (Review rating: reviews) {
                if(rating.author.equals(review.author)){
                    break;
                }
                }
            reviews.add(review);

            }
        }
    public void updateStars(){
        int counter = 0;
        int sum = 0;
        int average;
        for (Review rating: reviews) {
           counter++;
           sum += rating.rateStars;
           System.out.println("sum:"+ sum);
           System.out.println("counter"+counter);
        }
        average = sum/counter;
        System.out.println("avergae"+average);
        this.setStars(Math.round(average));

    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", dollarsSigns=" + dollarSigns +
                ", reviews='" + reviews +
                "}";
    }

}
