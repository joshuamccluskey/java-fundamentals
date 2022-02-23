package inheritance.restaurant;


import inheritance.restaurant.review.Review;



public class Restaurant {
    public static String name;
    public static int stars;
    public static int dollarSigns;


    public Restaurant(String name, int stars, int dollarsSigns)
    {
        this.name = name;
        this.stars = stars;
        this.dollarSigns =dollarsSigns;

    }

//    public void addReview (String name, int stars, int dollarSigns) {
//        name = this.getName();
//        this.setName(name);
//        stars = this.getStars();
//        this.setStars(stars);
//        dollarSigns = this.getDollarsSigns();
//        this.setDollarsSigns(dollarSigns);
//    }


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
        return dollarSigns;
    }

    public void setDollarsSigns(int dollarsSigns){
        this.dollarSigns = dollarsSigns;
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
