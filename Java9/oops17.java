import java.util.ArrayList;
import java.util.Scanner;

class Movie {
    private String title;
    private String director;
    private ArrayList<String> actors = new ArrayList<String>();
    private ArrayList<String> reviews = new ArrayList<String>();

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public void addActor(String actor) {
        actors.add(actor);
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Actors: " + actors);
        System.out.println("Reviews: ");
        for (String r : reviews) {
            System.out.println("- " + r);
        }
    }
}

class Testmain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Movie m = new Movie("Inception", "Christopher Nolan");
        m.addActor("Leonardo DiCaprio");
        m.addActor("Joseph Gordon-Levitt");
        m.addReview("Mind-blowing visuals");
        m.addReview("Excellent storytelling");
        m.displayDetails();
    }
}