import java.util.Scanner;

public class PurchaseDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input quantity and price per item
        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        // Calculate total expenses
        double totalExpenses = quantity * pricePerItem;

        // Apply discount based on quantity
        if (quantity > 50) {
            totalExpenses *= 0.9; // 10% discount
        } else if (quantity >= 25 && quantity <= 50) {
            totalExpenses *= 0.95; // 5% discount
        }

        // Output total expenses
        System.out.println("Total expenses: Rs. " + totalExpenses);

        scanner.close();
    }
}
