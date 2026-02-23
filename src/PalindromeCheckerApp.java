/**
 * MAIN CLASS UseCase8PalindromeCheckerApp
 * =======================================
 * Use Case 8: Palindrome Check Using Singly Linked List
 *
 * Description:
 * This program converts a string into a singly linked list,
 * finds the middle using the fast and slow pointer technique,
 * reverses the second half in-place, and compares both halves.
 *
 * Flow:
 * - Convert string to linked list
 * - Find middle (fast & slow pointers)
 * - Reverse second half
 * - Compare halves
 * - Display result
 *
 * @author Developer
 * @version 1.0
 */

public class PalindromeCheckerApp {

    // Node class for Singly Linked List
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Application entry point.
     */
    public static void main(String[] args) {

        String word = "madam";

        // Convert string to linked list
        Node head = null;
        Node tail = null;

        for (int i = 0; i < word.length(); i++) {
            Node newNode = new Node(word.charAt(i));

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        boolean isPalindrome = checkPalindrome(head);

        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program execution completed.");
    }

    // Method to check palindrome using linked list logic
    public static boolean checkPalindrome(Node head) {

        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find middle using fast & slow pointers
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half in-place
        Node secondHalf = reverseList(slow);

        // Step 3: Compare first half and reversed second half
        Node firstHalf = head;
        Node tempSecond = secondHalf;

        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }

        return true;
    }

    // In-place reversal of linked list
    public static Node reverseList(Node head) {

        Node prev = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev; // New head of reversed list
    }
}