import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of days late
        System.out.print("Enter the number of days late: ");
        int daysLate = scanner.nextInt();

        // Calculate fine
        double fine = 0;

        if (daysLate <= 7) {
            fine = daysLate * 0.5;
        } else if (daysLate <= 14) {
            fine = 7 * 0.5 + (daysLate - 7) * 1;
        } else if (daysLate <= 21) {
            fine = 7 * 0.5 + 7 * 1 + (daysLate - 14) * 5;
        } else {
            System.out.println("Your membership is canceled due to returning the book after 21 days.");
            scanner.close();
            return;
        }

        // Output fine information
        System.out.println("Fine for returning the book " + daysLate + " days late: Rs. " + fine);

        scanner.close();
    }
}
