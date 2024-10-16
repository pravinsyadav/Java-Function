import java.util.Scanner;

public class Palidrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call the function to check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int originalNumber = num;  // Store the original number
        int reversedNumber = reverseNumber(num);  // Call the function to reverse the number

        // Compare the reversed number with the original
        return originalNumber == reversedNumber;
    }

    // Function to reverse the given number
    public static int reverseNumber(int num) {
        int reversed = 0;

        while (num != 0) {
            int lastDigit = num % 10;  // Get the last digit
            reversed = reversed * 10 + lastDigit;  // Build the reversed number
            num /= 10;  // Remove the last digit
        }

        return reversed;
    }
}
