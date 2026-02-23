/**
 * MAIN CLASS UseCase9PalindromeCheckerApp
 * =======================================
 * Use Case 9: Palindrome Check Using Recursion
 *
 * Description:
 * This program checks whether a string is a palindrome
 * by recursively comparing characters from start and end
 * indices using the call stack.
 *
 * Flow:
 * - Recursive call compares start & end
 * - Base condition exits recursion
 * - Display result
 *
 * Key Concepts:
 * - Recursion
 * - Base Condition
 * - Call Stack
 *
 * @author Developer
 * @version 1.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point.
     */
    public static void main(String[] args) {

        String word = "level";

        boolean isPalindrome = isPalindromeRecursive(word, 0, word.length() - 1);

        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program execution completed.");
    }

    /**
     * Recursive method to check palindrome.
     *
     * @param str   Original string
     * @param start Start index
     * @param end   End index
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindromeRecursive(String str, int start, int end) {

        // Base condition: crossed indices or single character
        if (start >= end) {
            return true;
        }

        // If characters at current positions do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call: move inward
        return isPalindromeRecursive(str, start + 1, end - 1);
    }
}