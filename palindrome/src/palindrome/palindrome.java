package palindrome;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Store the original number for comparison later
        int original = number;
        
        // Variable to store the reversed number
        int reversed = 0;

        // Loop to reverse the number
        while (number != 0) {
            // Get the last digit of the number
            int digit = number % 10;
            // Append the digit to the reversed number
            reversed = reversed * 10 + digit;
            // Remove the last digit from the number
            number /= 10;
        }

        // Check if the original number is equal to the reversed number
        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }
}