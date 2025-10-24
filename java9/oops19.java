import java.util.ArrayList;
import java.util.Scanner;

class Travel {
    ArrayList<String> flights = new ArrayList<String>();
    ArrayList<String> hotels = new ArrayList<String>();
    ArrayList<String> bookings = new ArrayList<String>();

    public void searchFlight(String flight) {
        flights.add(flight);
        System.out.println("Flight found: " + flight);
    }

    public void searchHotel(String hotel) {
        hotels.add(hotel);
        System.out.println("Hotel found: " + hotel);
    }

    public void book(String item) {
        bookings.add(item);
        System.out.println("Booked: " + item);
    }

    public void cancel(String item) {
        if (bookings.remove(item)) {
            System.out.println("Cancelled: " + item);
        } else {
            System.out.println("Item not found in bookings");
        }
    }

    public void showBookings() {
        System.out.println("Current Bookings:");
        for (String b : bookings) {
            System.out.println("- " + b);
        }
    }
}

class Testmain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Travel t = new Travel();

        t.searchFlight("Indigo 6E123");
        t.searchHotel("Taj Palace");

        t.book("Indigo 6E123");
        t.book("Taj Palace");

        t.showBookings();
        System.out.println("-------------------------------------");

        t.cancel("Indigo 6E123");
        t.showBookings();
    }
}