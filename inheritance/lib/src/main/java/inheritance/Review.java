package inheritance;



public class Review  {
    public static String author;
    public static String name;
    public static int rateStars;
    public static String body;


    public Review( String author, String name , String body,  int rateStars){
        this.author = author;
        this.name = name;
        this.body = body;
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
