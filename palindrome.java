import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int originalNumber = num;  // Store the original number
        int reversedNumber = 0;

        // Reverse the number
        while (num != 0) {
            int lastDigit = num % 10;  // Get the last digit
            reversedNumber = reversedNumber * 10 + lastDigit;  // Build the reversed number
            num /= 10;  // Remove the last digit
        }

        // Compare the reversed number with the original
        return originalNumber == reversedNumber;
    }
}

