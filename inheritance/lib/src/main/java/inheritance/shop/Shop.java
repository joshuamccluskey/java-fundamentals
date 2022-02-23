package inheritance.shop;

import inheritance.review.Review;
import inheritance.reviewable.Reviewer;

import java.util.ArrayList;

public class Shop implements Reviewer {

    public static String name;
    public static String description;
    public static int dollarSigns;
    public static int stars;
    public static ArrayList<Object> shopReviews;



    public Shop(String name, String description, int dollarsSigns, int stars)
    {
        this.name = name;
        this.description = description;
        this.dollarSigns =dollarsSigns;
        this.stars = stars;
        shopReviews = new ArrayList<>();

    }



    public  void setStars(int stars){
        this.setStars(stars);
    }

    @Override
    public void addReview() {
        Review firstReview = new Review("Target", "This store is great!", "Josh", 4);
        Review secondReview = new Review("Bartels", "I'll be back!", "Josh", 4);



       if (this.name.equals(Review.name))
        {
            this.shopReviews.add(firstReview);
        }else if (Shop.name.equals(Review.name))
        {
            this.shopReviews.add(secondReview);
       }

    }

    @Override
    public String toString() {
        return "Shop{" +
                "name=" + name +
                ", description=" + description +
                ", Stars=" + stars +
                ", dollarsSigns=" + dollarSigns +
                ", Reviews=" + shopReviews +
                "}";
    }
}
