package inheritance.review;



public abstract class Review  {
    public static String name;
    public static int rateStars;
    public static int dollarSigns;
    public static String author;
    public static String body;


    public Review( String name , int dollarSigns, String body, String author, int rateStars){
        this.name =name;
        this.dollarSigns = dollarSigns;
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
                ", rateStars='"+ rateStars +
                ", dollarsSigns=" + dollarSigns +
                ", author='" + author + '\'' +
                ", body='" + body + '\'' +
                "'}";
    }
}
//    String body;
//    String author;