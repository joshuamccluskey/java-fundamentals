/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;


import inheritance.restaurant.Restaurant;
import inheritance.restaurant.review.Review;


public class Library {

    public boolean newRestaurant() {
        Restaurant myRestaurant = new Restaurant("Rays", 2, 3);
        System.out.println(myRestaurant);
        return true;
    }

    public boolean newReview() {
        Review myReview = new Review( "this was great", "Josh", 5);
        System.out.println(myReview);
        return true;
    }


}
