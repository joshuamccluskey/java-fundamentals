package inheritance.review;

public class TheaterReview extends Review {
    public static String movie;

    public TheaterReview(User author, String name, String body, int rateStars, String movie) {
        super(author, name, body, rateStars);
        this.movie = movie;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "TheaterReview{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", rateStars=" + rateStars +
                ", body='" + body + '\'' +
                ", movie='" + movie + '\'' +
                '}';
    }
}
