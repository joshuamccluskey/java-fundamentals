package inheritance.restaurant.review;

import inheritance.restaurant.Restaurant;

public class Review extends Restaurant {
    public static String body;
    public static String author;
    private static int rateStars;
    public Review( String body, String author, int rateStars){
        super(Restaurant.name, Restaurant.stars, Restaurant.dollarSigns);
        this.body = body;
        this.author = author;
        this.rateStars = rateStars;

//        addReview(Restaurant.name, Restaurant.stars, Restaurant.dollarSigns);

    }


//    @Override
//    public void addReview(){
//        Review myReview = new Review( "this was great", "Josh", 5);
//    }

    @Override
    public String toString() {
        return "Review{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", dollarsSigns=" + dollarSigns +
                ", body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", rateStars=" +
                '}';
    }
}
//    String body;
//    String author;