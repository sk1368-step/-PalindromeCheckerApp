/**
 * MAIN CLASS
 * ========================================
 * Use Case 13: Palindrome Algorithm Performance Comparison
 *
 * Goal:
 * Compare execution time of different palindrome algorithms.
 *
 * Concepts Used:
 * - Strategy Pattern
 * - System.nanoTime()
 * - Performance benchmarking
 * - Stack, Deque, Two-pointer approaches
 *
 * Author: Developer
 * Version: 4.0
 */

public class PalindromePerformanceApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Normalize input once
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        // Create strategies
        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeStrategy dequeStrategy = new DequeStrategy();
        PalindromeStrategy twoPointerStrategy = new TwoPointerStrategy();

        // Run performance tests
        testPerformance("Stack Strategy", stackStrategy, normalized);

        testPerformance("Deque Strategy", dequeStrategy, normalized);

        testPerformance("Two Pointer Strategy", twoPointerStrategy, normalized);

        System.out.println("Performance comparison completed.");
    }


    /**
     * Measures and displays execution time
     */
    public static void testPerformance(String name,
                                       PalindromeStrategy strategy,
                                       String input) {

        long startTime = System.nanoTime();

        boolean result = strategy.isPalindrome(input);

        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("-----------------------------------");
        System.out.println("Algorithm: " + name);
        System.out.println("Result: " + result);
        System.out.println("Execution Time: " + duration + " ns");
    }
}


/**
 * Strategy Interface
 */
interface PalindromeStrategy {

    boolean isPalindrome(String input);
}


/**
 * Stack Strategy
 */
class StackStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}


/**
 * Deque Strategy
 */
class DequeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {

        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}


/**
 * Two Pointer Strategy (Most Efficient)
 */
class TwoPointerStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {

        char[] chars = input.toCharArray();

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