package inheritance.shop;

public class Shop {

    public static String name;
    public static String description;
    public static int dollarSigns;



    public Shop(String name, String description, int dollarsSigns)
    {
        this.name = name;
        this.description = description;
        this.dollarSigns =dollarsSigns;

    }


    @Override
    public String toString() {
        return "Shop{" +
                "name=" + name +
                ", description=" + description +
                ", dollarsSigns=" + dollarSigns +
                "}";
    }
}
