package inheritance.restaurant;


public class Restaurant {
    public String name;
    public int stars;
    public int dollarsSigns;

    public Restaurant(String name, int stars, int dollarsSigns)
    {
        this.name = name;
        this.stars = stars;
        this.dollarsSigns =dollarsSigns;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getStars(){
        return stars;
    }

    public void setStars(int stars){
        this.stars = stars;
    }

    public int getDollarsSigns(){
        return dollarsSigns;
    }

    public void setDollarsSigns(int dollarsSigns){
        this.dollarsSigns = dollarsSigns;
    }

    @Override
    public String  toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", dollarsSigns=" + dollarsSigns +
                '}';
    }
}
