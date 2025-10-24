import java.util.ArrayList;
import java.util.Scanner;

class Restaurant {
    private String item;
    private int price;
    private int rating;
    ArrayList<Restaurant> menu = new ArrayList<Restaurant>();

    public Restaurant(String item, int price, int rating) {
        this.item = item;
        this.price = price;
        this.rating = rating;
    }

    public Restaurant() {}

    public String getItemDetails() {
        return item + " : " + price + " : " + rating;
    }

    public void addItem(Restaurant r) {
        menu.add(r);
    }

    public void removeItem(Restaurant r) {
        menu.remove(r);
    }

    public void displayMenu() {
        for (Restaurant r : menu) {
            System.out.println(r.getItemDetails());
        }
    }

    public void averageRating() {
        int total = 0;
        for (Restaurant r : menu) {
            total += r.rating;
        }
        double avg = (double) total / menu.size();
        System.out.println("Average Rating: " + avg);
    }
}

class Testmain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Restaurant r1 = new Restaurant("Pizza", 250, 4);
        Restaurant r2 = new Restaurant("Burger", 150, 5);
        Restaurant r3 = new Restaurant("Pasta", 200, 3);

        Restaurant menu = new Restaurant();
        menu.addItem(r1);
        menu.addItem(r2);
        menu.addItem(r3);
        menu.displayMenu();
        menu.averageRating();
        System.out.println("-------------------------------------");
        menu.removeItem(r2);
        menu.displayMenu();
        menu.averageRating();
    }
}