
import java.util.Scanner;

public class f {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Constant
        final double DRINK_PRICE = 15.50;

        // Variables
        String name;
        int age;
        double mealPrice;
        int drinks;
        boolean isStudent;
        int rating;

        double drinksCost;
        double subtotal;
        double discount = 0;
        double tip = 0;
        double finalBill;
        int wholeAmount;

        // Collect customer information
        System.out.print("Enter customer name: ");
        name = input.nextLine();

        System.out.print("Enter customer age: ");
        age = input.nextInt();

        System.out.print("Enter meal price: ");
        mealPrice = input.nextDouble();

        System.out.print("Enter number of drinks: ");
        drinks = input.nextInt();

        System.out.print("Are you a student? (true/false): ");
        isStudent = input.nextBoolean();

        System.out.print("Enter service rating (1-5): ");
        rating = input.nextInt();

        // Calculate drinks cost
        drinksCost = drinks * DRINK_PRICE;

        // Calculate subtotal
        subtotal = mealPrice + drinksCost;

        // Calculate discount
        if (isStudent && age >= 60) {
            discount = subtotal * 0.10;
        }
        else if (isStudent) {
            discount = subtotal * 0.10;
        }
        else if (age >= 60) {
            discount = subtotal * 0.05;
        }
        else {
            discount = 0;
        }

        // Calculate tip
        if (rating >= 1 && rating <= 5) {

            if (rating == 4 || rating == 5) {
                tip = (subtotal - discount) * 0.10;
            }

        } else {
            System.out.println("Error: Invalid service rating!");
        }

        // Calculate final bill
        finalBill = subtotal - discount + tip;

        // Type casting
        wholeAmount = (int) finalBill;

        // Display receipt
        System.out.println("\n========== SMART RESTAURANT ==========");
        System.out.println("Customer: " + name);
        System.out.printf("Meal: $%.2f%n", mealPrice);
        System.out.printf("Drinks: $%.2f%n", drinksCost);
        System.out.printf("Discount: $%.2f%n", discount);
        System.out.printf("Tip: $%.2f%n", tip);
        System.out.printf("Final bill: $%.2f%n", finalBill);
        System.out.println("Whole amount: $" + wholeAmount);
        System.out.println("======================================");

        input.close();
    }
}
