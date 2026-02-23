import java.util.Stack;

/**
 * MAIN CLASS UseCase5PalindromeCheckerApp
 * =======================================
 * Use Case 5: Palindrome Check Using Stack
 *
 * Description:
 * This program checks whether a string is a palindrome
 * by pushing characters onto a stack and then popping
 * them to compare with the original string.
 *
 * Flow:
 * - Push characters into stack
 * - Pop and compare
 * - Print result
 *
 * @author Developer
 * @version 1.0
 */

public class UseCase5PalindromeCheckerApp {

    /**
     * Application entry point.
     * JVM starts execution here.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Original string
        String word = "madam";

        // Create a Stack of Characters
        Stack<Character> stack = new Stack<>();

        // Push each character into the stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));   // Push operation
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Pop characters and compare with original
        for (int i = 0; i < word.length(); i++) {

            char poppedChar = stack.pop();   // Pop operation

            if (word.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program execution completed.");
    }
}