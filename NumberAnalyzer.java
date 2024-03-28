import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        boolean continueInput = true;

        while (continueInput) {
            System.out.print("Enter a number (or enter 'done' to finish): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                continueInput = false;
            } else {
                try {
                    int number = Integer.parseInt(input);
                    sum += number;
                    count++;

                    if (number < smallest) {
                        smallest = number;
                    }

                    if (number > largest) {
                        largest = number;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number or 'done' to finish.");
                }
            }
        }

        scanner.close();

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Largest number entered: " + largest);
            System.out.println("Smallest number entered: " + smallest);
            System.out.println("Average of all numbers entered: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}
