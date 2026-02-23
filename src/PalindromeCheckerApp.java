/**
 * MAIN CLASS UseCase3PalindromeCheckerApp
 * =======================================
 * Use Case 3: Reverse String Using Loop
 *
 * Description:
 * This program checks whether a string is a palindrome
 * by reversing it using a for loop and comparing
 * the original and reversed strings.
 *
 * Flow:
 * - Reverse string using loop
 * - Compare original and reversed
 * - Display result
 *
 * @author Developer
 * @version 1.0
 */

public class UseCase3PalindromeCheckerApp {

    /**
     * Application entry point.
     * JVM starts execution here.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Original string
        String original = "level";

        // Variable to store reversed string
        String reversed = "";

        // Loop to reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);  // String concatenation
        }

        // Compare using equals() method
        if (original.equals(reversed)) {
            System.out.println("The word \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + original + "\" is NOT a Palindrome.");
        }

        System.out.println("Program execution completed.");
    }
}