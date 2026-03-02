/**
 * MAIN CLASS UseCase11PalindromeCheckerApp
 * ========================================
 * Use Case 11: Encapsulated Palindrome Checker (OOP Version)
 *
 * Description:
 * This program encapsulates palindrome logic inside a separate class.
 *
 * Flow:
 * - Create PalindromeChecker object
 * - Call checkPalindrome() method
 * - Display result
 *
 * Key Concepts:
 * - Encapsulation
 * - Single Responsibility Principle
 * - Internal Data Structure (Array-based two-pointer logic)
 *
 * Author: Developer
 * Version: 2.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        // Call encapsulated method
        boolean result = checker.checkPalindrome(input);

        // Display result
        if (result) {
            System.out.println("The input \"" + input + "\" is a Palindrome (ignoring spaces and case).");
        } else {
            System.out.println("The input \"" + input + "\" is NOT a Palindrome (ignoring spaces and case).");
        }

        System.out.println("Program execution completed.");
    }
}

/**
 * PalindromeChecker Class
 * ------------------------
 * Responsibility:
 * Handles palindrome validation logic only.
 */
class PalindromeChecker {

    /**
     * Public method to check palindrome.
     * Handles normalization + validation.
     *
     * @param input Original string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        // Step 1: Normalize string
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        // Step 2: Convert to char array (internal data structure)
        char[] chars = normalized.toCharArray();

        // Step 3: Two-pointer comparison
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}