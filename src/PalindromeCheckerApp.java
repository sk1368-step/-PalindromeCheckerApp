import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * MAIN CLASS UseCase6PalindromeCheckerApp
 * =======================================
 * Use Case 6: FIFO vs LIFO Demonstration
 *
 * Description:
 * This program demonstrates the difference between
 * Queue (FIFO) and Stack (LIFO) by inserting the same
 * characters into both structures and comparing their
 * removal behavior to validate palindrome logic.
 *
 * Flow:
 * - Enqueue characters into Queue (FIFO)
 * - Push characters into Stack (LIFO)
 * - Compare Dequeue vs Pop results
 * - Display result
 *
 * @author Developer
 * @version 1.0
 */

public class UseCase6PalindromeCheckerApp {

    /**
     * Application entry point.
     * JVM starts execution here.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Original string
        String word = "level";

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert characters into both structures
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            queue.add(ch);     // Enqueue operation
            stack.push(ch);    // Push operation
        }

        boolean isPalindrome = true;

        // Compare dequeue (FIFO) with pop (LIFO)
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove();  // Dequeue (FIFO)
            char fromStack = stack.pop();     // Pop (LIFO)

            if (fromQueue != fromStack) {
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