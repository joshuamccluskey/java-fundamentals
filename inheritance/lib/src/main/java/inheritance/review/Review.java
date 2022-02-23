package inheritance.review;



public class Review  {
    public static String name;
    public static int rateStars;
    public static String author;
    public static String body;


    public Review( String name , String body, String author, int rateStars){
        this.name = name;
        this.body = body;
        this.author = author;
        this.rateStars = rateStars;

    }


    @Override
    public String toString() {
        return "Review{" +
                "name=" + name  +
                ", rateStars="+ rateStars +
                ", author=" + author  +
                ", body=" + body  +
                "}";
    }
}
