import java.util.LinkedList;

/**
 * LinkedList: Best for frequent insertions/deletions at both ends
 * Use Case: Browser History (Back/Forward navigation)
 */
public class LinkedListExample {
    public static void main(String[] args) {
        System.out.println("=== LINKEDLIST EXAMPLE: Browser History ===\n");

        LinkedList<String> history = new LinkedList<>();

        // Adding pages visited
        history.addLast("google.com");
        history.addLast("facebook.com");
        history.addLast("youtube.com");
        history.addLast("github.com");
        history.addFirst("canvas.com");

        System.out.println("Pages visited: " + history);
        System.out.println("Current page (last): " + history.getLast());
        System.out.println("First page visited: " + history.getFirst());

        // Go back (remove last)
        System.out.println("\n--- Pressing BACK button ---");
        String removed = history.removeLast();
        System.out.println("Left: " + removed);
        System.out.println("Current page: " + history.getLast());

        // Add new page in middle
        System.out.println("\n--- Adding page after first ---");
        history.add(1, "twitter.com");
        System.out.println("History: " + history);

        // LinkedList allows null
        history.addLast(null);
        System.out.println("With null: " + history);
    }
}