package inheritance.restaurant.review;

import inheritance.restaurant.Restaurant;

public class Review extends Restaurant {
    String body;
    String author;
    int rateStars;
    public Review(String name,int stars, int dollarSigns, String body, String author, int rateStars){
        super(name, stars, dollarSigns);
        this.body = body;
        this.author = author;
        this.rateStars = rateStars;

    }

    @Override
    public String toString() {
        return "Review{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", dollarsSigns=" + dollarsSigns +
                ", body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", rateStars=" + rateStars +
                '}';
    }
}
//    String body;
//    String author;