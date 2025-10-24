import java.util.Scanner;
class test 
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Gender (male/female): ");
        String gender = sc.nextLine().toLowerCase();

        String gift = gender.equals("female") ? "Cadeberry" : "Ladger Wallet";

        // Item 1
        System.out.print("Enter name of Item-1: ");
        String item1 = sc.nextLine();
        System.out.print("Enter quantity of " + item1 + ": ");
        int qty1 = sc.nextInt();
        double price1 = 10;
        double total1 = qty1 * price1;
        double discount1 = (qty1 > 4) ? total1 * 0.05 : 0;
        double final1 = total1 - discount1;
        sc.nextLine();

        // Item 2
        System.out.print("Enter name of Item-2: ");
        String item2 = sc.nextLine();
        System.out.print("Enter quantity of " + item2 + ": ");
        int qty2 = sc.nextInt();
        double price2 = 20;
        double total2 = qty2 * price2;
        double final2 = total2;
        sc.nextLine();

        // Item 3
        System.out.print("Enter name of Item-3: ");
        String item3 = sc.nextLine();
        System.out.print("Enter quantity of " + item3 + ": ");
        int qty3 = sc.nextInt();
        double price3 = 30;
        double total3 = qty3 * price3;
        double final3 = total3;
        sc.nextLine();

        // Item 4
        System.out.print("Enter name of Item-4: ");
        String item4 = sc.nextLine();
        System.out.print("Enter quantity of " + item4 + ": ");
        int qty4 = sc.nextInt();
        double price4 = 40;
        double total4 = qty4 * price4;
        double final4 = total4;
        sc.nextLine();

        // Item 5
        System.out.print("Enter name of Item-5: ");
        String item5 = sc.nextLine();
        System.out.print("Enter quantity of " + item5 + ": ");
        int qty5 = sc.nextInt();
        double price5 = 50;
        double total5 = qty5 * price5;
        double discount5 = total5 * 0.10;
        double final5 = total5 - discount5;
        sc.nextLine();

        // Item 6
        System.out.print("Enter name of Item-6: ");
        String item6 = sc.nextLine();
        System.out.print("Enter quantity of " + item6 + ": ");
        int qty6 = sc.nextInt();
        double price6 = 60;
        double total6 = qty6 * price6;
        double final6 = total6;
        sc.nextLine();

        // Item 7
        System.out.print("Enter name of Item-7: ");
        String item7 = sc.nextLine();
        System.out.print("Enter quantity of " + item7 + ": ");
        int qty7 = sc.nextInt();
        double price7 = 70;
        double total7 = qty7 * price7;
        double final7 = total7;
        sc.nextLine();

        // Item 8
        System.out.print("Enter name of Item-8: ");
        String item8 = sc.nextLine();
        System.out.print("Enter quantity of " + item8 + ": ");
        int qty8 = sc.nextInt();
        double price8 = 80;
        double total8 = qty8 * price8;
        double final8 = total8;
        sc.nextLine();

        // Item 9
        System.out.print("Enter name of Item-9: ");
        String item9 = sc.nextLine();
        System.out.print("Enter quantity of " + item9 + ": ");
        int qty9 = sc.nextInt();
        double price9 = 90;
        double total9 = qty9 * price9;
        double final9 = total9;
        sc.nextLine();

        // Item 10
        System.out.print("Enter name of Item-10: ");
        String item10 = sc.nextLine();
        System.out.print("Enter quantity of " + item10 + ": ");
        int qty10 = sc.nextInt();
        double price10 = 100;
        double total10 = qty10 * price10;
        double discount10 = total10 * 0.15;
        double final10 = total10 - discount10;
        sc.nextLine();

        // Total calculations
        double actualTotal = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9 + total10;
        double discountTotal = final1 + final2 + final3 + final4 + final5 + final6 + final7 + final8 + final9 + final10;

        double mainDiscount = 0;
        if (discountTotal > 10000) 
        {
            mainDiscount = discountTotal * 0.15;
        } 
        else if (discountTotal >= 5000) 
        {
            mainDiscount = discountTotal * 0.10;
        }

        double afterMainDiscount = discountTotal - mainDiscount;
        double gst = afterMainDiscount * 0.10;

        System.out.print("Need carry bag? (yes/no): ");
        String carry = sc.nextLine();
        int carryBag = carry.equalsIgnoreCase("yes") ? 10 : 0;

        double finalAmount = afterMainDiscount + gst + carryBag;

        // BILL OUTPUT
        System.out.println("\n\n------------------------ D-Mart ------------------------");
        System.out.println("Name: " + name + "\t\tDate: 22/07/2025");
        System.out.println("--------------------------------------------------------");
        System.out.println("Item\tQty\tPrice\tTotal\tAfter-Discount");

        System.out.printf("%s\t%d\t%.0f\t%.0f\t%.2f\n", item1, qty1, price1, total1, final1);
        System.out.printf("%s\t%d\t%.0f\t%.0f\t%.2f\n", item2, qty2, price2, total2, final2);
        System.out.printf("%s\t%d\t%.0f\t%.0f\t%.2f\n", item3, qty3, price3, total3, final3);
        System.out.printf("%s\t%d\t%.0f\t%.0f\t%.2f\n", item4, qty4, price4, total4, final4);
        System.out.printf("%s\t%d\t%.0f\t%.0f\t%.2f\n", item5, qty5, price5, total5, final5);
        System.out.printf("%s\t%d\t%.0f\t%.0f\t%.2f\n", item6, qty6, price6, total6, final6);
        System.out.printf("%s\t%d\t%.0f\t%.0f\t%.2f\n", item7, qty7, price7, total7, final7);
        System.out.printf("%s\t%d\t%.0f\t%.0f\t%.2f\n", item8, qty8, price8, total8, final8);
        System.out.printf("%s\t%d\t%.0f\t%.0f\t%.2f\n", item9, qty9, price9, total9, final9);
        System.out.printf("%s\t%d\t%.0f\t%.0f\t%.2f\n", item10, qty10, price10, total10, final10);

        System.out.println("--------------------------------------------------------");
        System.out.printf("Actual Price (A.P):\t\t\t%.2f\n", actualTotal);
        System.out.printf("Discounted Price (D.P):\t\t\t%.2f\n", discountTotal);
        System.out.println("Gift:\t" + gift + "\t\t\t0.00");
        System.out.printf("Carry Bag:\t%s\t\t\t%d.00\n", carry, carryBag);
        System.out.printf("GST (10%%):\t\t\t\t%.2f\n", gst);
        System.out.println("--------------------------------------------------------");
        System.out.printf("Total Amount:\t\t\t\t%.2f Rs\n", finalAmount);
        System.out.println("\n\tThank You\n\tTo Visit us\n\tD-Mart");
        System.out.println("--------------------------------------------------------");
    }
}