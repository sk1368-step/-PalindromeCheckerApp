import java.util.ArrayDeque;
import java.util.Deque;

/**
 * MAIN CLASS UseCase7PalindromeCheckerApp
 * =======================================
 * Use Case 7: Palindrome Check Using Deque
 *
 * Description:
 * This program checks whether a string is a palindrome
 * by inserting characters into a Deque and comparing
 * elements from the front and rear.
 *
 * Flow:
 * - Insert characters into deque
 * - Remove first & last elements
 * - Compare until deque is empty or has one element
 * - Display result
 *
 * @author Developer
 * @version 1.0
 */

public class UseCase7PalindromeCheckerApp {

    /**
     * Application entry point.
     * JVM starts execution here.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Original string
        String word = "racecar";

        // Create Deque (Double Ended Queue)
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));  // Insert at rear
        }

        boolean isPalindrome = true;

        // Compare front and rear elements
        while (deque.size() > 1) {

            char front = deque.removeFirst();  // Remove from front
            char rear  = deque.removeLast();   // Remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
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