package inheritance;

import java.util.ArrayList;

public class Shop extends Location  {

    public static String name;
    public static int dollarSigns;
    public static int stars;
    public static ArrayList<Object> shopReviews;
    public static String description;

    public Shop(String name, int stars, int dollarsSigns, String description)
    {
        super(name, stars, dollarsSigns);
        this.description = description;
    }


    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        Shop.description = description;
    }


    @Override
    public String toString() {
        return "Shop{" +
                "name=" + name +
                ", Stars=" + stars +
                ", dollarsSigns=" + dollarSigns +
                ", Reviews=" + shopReviews +
                ", description=" + description +
                "}";
    }
}
