package inheritance.restaurant;


import java.util.ArrayList;

public class Restaurant {
    public static String name;
    public static int stars;
    public static int dollarSigns;
    public static ArrayList<Object> reviews = new ArrayList<Object>();



    public Restaurant(String name, int stars, int dollarsSigns, ArrayList<Object> reviews)
    {
        this.name = name;
        this.stars = stars;
        this.dollarSigns = dollarsSigns;
        this.reviews = reviews;

    }

//    public void addReview (String name, int stars, int dollarSigns) {
//        name = this.getName();
//        this.setName(name);
//        stars = this.getStars();
//        this.setStars(stars);
//        dollarSigns = this.getDollarsSigns();
//        this.setDollarsSigns(dollarSigns);
//    }





    @Override
    public String  toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", dollarsSigns=" + dollarSigns +
                '}';
    }
}
