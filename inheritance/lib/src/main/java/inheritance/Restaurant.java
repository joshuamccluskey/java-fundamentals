package inheritance;


import java.util.ArrayList;

public class Restaurant extends Location {


    public Restaurant(String name, int stars, int dollarSigns)
    {
         super(name, stars, dollarSigns);

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
