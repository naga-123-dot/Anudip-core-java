package number;
import java.util.Scanner;
public class numbers {
	 public static void main(String[] args) {
	        // Create a Scanner object to read input from the user
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user to enter the number of rows for the pattern
	        System.out.print("Enter the number of rows: ");
	        int n = scanner.nextInt();
	        
	        // Loop through each row
	        for (int i = 1; i <= n; i++) {
	            // Loop through each column in the row
	            for (int j = 1; j <= i; j++) {
	                // Print the current number
	                System.out.print(j + " ");
	            }
	            // Move to the next line after each row
	            System.out.println();
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}
