import java.util.ArrayDeque;

/**
 * ArrayDeque: Best for Stack (LIFO) and Queue (FIFO) operations
 * Use Case: Stack for Undo, Queue for Task Processing
 */
public class ArrayDequeExample {
    public static void main(String[] args) {
        System.out.println("=== ARRAYDEQUE EXAMPLE ===\n");

        // ========== AS A STACK (LIFO) ==========
        System.out.println("--- Using as STACK (Undo Feature) ---");
        ArrayDeque<String> undoStack = new ArrayDeque<>();

        // Push actions
        undoStack.push("Type 'Hello'");
        undoStack.push("Type 'World'");
        undoStack.push("Delete 'World'");
        undoStack.push("Type 'Java'");

        System.out.println("Actions performed: " + undoStack);
        System.out.println("Last action (peek): " + undoStack.peek());

        // Undo (pop)
        System.out.println("\nPressing UNDO:");
        while (!undoStack.isEmpty()) {
            System.out.println("  Undoing: " + undoStack.pop());
        }

        // ========== AS A QUEUE (FIFO) ==========
        System.out.println("\n--- Using as QUEUE (Print Jobs) ---");
        ArrayDeque<String> printQueue = new ArrayDeque<>();

        // Add to queue
        printQueue.offer("Document1.pdf");
        printQueue.offer("Photo.jpg");
        printQueue.offer("Report.docx");

        System.out.println("Print queue: " + printQueue);
        System.out.println("Next to print: " + printQueue.peek());

        // Process queue
        System.out.println("\nProcessing print jobs:");
        while (!printQueue.isEmpty()) {
            System.out.println("  Printing: " + printQueue.poll());
        }

        // ========== AS A DEQUE (Both Ends) ==========
        System.out.println("\n--- Using as DEQUE (Both Ends) ---");
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.addFirst("Middle");
        deque.addFirst("Start");    // Add to front
        deque.addLast("End");       // Add to back

        System.out.println("Deque: " + deque);
        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());
    }
}