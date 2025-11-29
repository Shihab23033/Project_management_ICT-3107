import java.util.PriorityQueue;
import java.util.Collections;

/**
 * PriorityQueue: Best for processing elements by priority
 * Use Case: Hospital Emergency Room
 */
public class PriorityQueueExample {
    public static void main(String[] args) {
        System.out.println("=== PRIORITYQUEUE EXAMPLE: Emergency Room ===\n");

        // Min-Heap (default) - smallest number = highest priority
        System.out.println("--- Using Min-Heap (default) ---");
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.offer(5);
        minHeap.offer(1);
        minHeap.offer(3);
        minHeap.offer(2);
        minHeap.offer(4);

        System.out.print("Processing order: ");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }

        // Max-Heap - largest number = highest priority
        System.out.println("\n\n--- Using Max-Heap (reverse order) ---");
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.offer(5);
        maxHeap.offer(1);
        maxHeap.offer(3);
        maxHeap.offer(2);
        maxHeap.offer(4);

        System.out.print("Processing order: ");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }

        // Custom objects with priority
        System.out.println("\n\n--- Hospital Patients (by severity) ---");
        PriorityQueue<String[]> patients = new PriorityQueue<>(
                (a, b) -> Integer.parseInt(b[1]) - Integer.parseInt(a[1])  // Higher severity first
        );

        patients.offer(new String[]{"Sajeeb", "3"});    // Low severity
        patients.offer(new String[]{"Rohan", "9"});   // High severity
        patients.offer(new String[]{"Jarif", "5"});     // Medium severity

        System.out.println("Treatment order:");
        while (!patients.isEmpty()) {
            String[] patient = patients.poll();
            System.out.println("  Treating: " + patient[0] + " (Severity: " + patient[1] + ")");
        }
    }
}