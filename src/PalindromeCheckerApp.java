/**
 * MAIN CLASS UseCase2PalindromeCheckerApp
 * =======================================
 * Use Case 2: Hardcoded Palindrome Check
 *
 * Description:
 * This class checks whether a hardcoded string
 * is a palindrome and prints the result.
 *
 * Flow:
 * - Program starts
 * - Hardcoded string is checked
 * - Result is printed
 * - Program exits
 *
 * @author Developer
 * @version 1.0
 */

public class UseCase2PalindromeCheckerApp {

    /**
     * Application entry point.
     * JVM starts execution here.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Hardcoded string literal
        String word = "madam";

        // Reverse the string
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Check palindrome using conditional statement
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program execution completed.");
    }
}