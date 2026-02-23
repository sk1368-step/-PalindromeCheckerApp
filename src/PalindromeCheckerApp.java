/**
 * MAIN CLASS UseCase10PalindromeCheckerApp
 * =======================================
 * Use Case 10: Palindrome Check Ignoring Spaces and Case
 *
 * Description:
 * This program checks whether a string is a palindrome
 * while ignoring spaces, punctuation, and case differences.
 *
 * Flow:
 * - Normalize string (remove non-alphanumeric, convert to lowercase)
 * - Apply previous palindrome logic (using two-pointer)
 * - Display result
 *
 * Key Concepts:
 * - String preprocessing
 * - Regular expressions
 * - Data Structure: String / Array
 *
 * Author: Developer
 * Version: 1.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point.
     */
    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Step 1: Normalize string
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "")  // Remove non-alphanumeric
                .toLowerCase();                   // Convert to lowercase

        // Step 2: Apply two-pointer palindrome check
        boolean isPalindrome = isPalindrome(normalized);

        // Step 3: Display result
        if (isPalindrome) {
            System.out.println("The input \"" + input + "\" is a Palindrome (ignoring spaces and case).");
        } else {
            System.out.println("The input \"" + input + "\" is NOT a Palindrome (ignoring spaces and case).");
        }

        System.out.println("Program execution completed.");
    }

    /**
     * Two-pointer palindrome check
     *
     * @param str Normalized string
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}