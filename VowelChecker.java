import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert input to lowercase for case-insensitive comparison
        input = input.toLowerCase();

        // Initialize variables for vowel check and count
        boolean vowelPresent = false;
        int vowelCount = 0;

        // Define vowels
        String vowels = "aeiou";

        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a vowel
            if (vowels.indexOf(ch) != -1) {
                vowelPresent = true;
                vowelCount++;
            }
        }

        // Output result
        if (vowelPresent) {
            System.out.println("Vowels are present in the string.");
            System.out.println("Total number of vowels: " + vowelCount);
        } else {
            System.out.println("No vowels are present in the string.");
        }

        scanner.close();
    }
}
