/**
 * MAIN CLASS UseCase4PalindromeCheckerApp
 * =======================================
 * Use Case 4: Character Array & Two-Pointer Technique
 *
 * Description:
 * This program checks whether a string is a palindrome
 * by converting it into a character array and comparing
 * characters using the two-pointer approach.
 *
 * Flow:
 * - Convert string to char[]
 * - Use two-pointer technique
 * - Compare start & end characters
 * - Display result
 *
 * @author Developer
 * @version 1.0
 */

public class UseCase4PalindromeCheckerApp {

    /**
     * Application entry point.
     * JVM starts execution here.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Original string
        String word = "radar";

        // Convert string to character array
        char[] characters = word.toCharArray();

        // Initialize two pointers
        int start = 0;
        int end = characters.length - 1;

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program execution completed.");
    }
}