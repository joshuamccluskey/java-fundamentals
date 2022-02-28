package inheritance.restaurant;


import inheritance.reviewable.Reviewer;

import java.util.ArrayList;

public class Restaurant implements Reviewer {
    public static String name;
    public static int stars;
    public static int dollarSigns;
    public static ArrayList<Object> restaurantReviews;



    public Restaurant(String name, int stars, int dollarsSigns)
    {
        this.name = name;
        this.stars = stars;
        this.dollarSigns = dollarsSigns;
        restaurantReviews = new ArrayList<>();

    }



    @Override
    public void addReview() {
        //TODO Build out Add Review
    }

    @Override
    public String  toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", dollarsSigns=" + dollarSigns +
                '}';
    }
}
