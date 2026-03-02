/**
 * MAIN CLASS
 * ========================================
 * Use Case 12: Strategy-Based Palindrome Checker (OOP + Strategy Pattern)
 *
 * Goal:
 * Dynamically choose palindrome algorithm at runtime.
 *
 * Concepts Used:
 * - Interface
 * - Polymorphism
 * - Strategy Pattern
 * - Stack Data Structure
 * - Deque Data Structure
 *
 * Author: Developer
 * Version: 3.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Choose strategy at runtime
        PalindromeStrategy strategy;

        // Option 1: Stack strategy
        strategy = new StackStrategy();

        // Option 2: Deque strategy
        // strategy = new DequeStrategy();

        // Inject strategy into checker
        PalindromeChecker checker = new PalindromeChecker(strategy);

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("The input \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The input \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("Strategy used: " + strategy.getClass().getSimpleName());
        System.out.println("Program execution completed.");
    }
}


/**
 * Strategy Interface
 * ========================================
 * Defines contract for palindrome checking algorithms.
 */
interface PalindromeStrategy {

    boolean isPalindrome(String input);
}


/**
 * Context Class
 * ========================================
 * Uses injected strategy.
 */
class PalindromeChecker {

    private PalindromeStrategy strategy;

    // Constructor Injection
    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        // Normalize input
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        return strategy.isPalindrome(normalized);
    }
}


/**
 * Stack Strategy Implementation
 * ========================================
 * Uses Stack data structure.
 */
class StackStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push all characters
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare while popping
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}


/**
 * Deque Strategy Implementation
 * ========================================
 * Uses Deque (Double-ended queue)
 */
class DequeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {

        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

        // Add all characters
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Compare from both ends
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                return false;
            }
        }

        return true;
    }
}