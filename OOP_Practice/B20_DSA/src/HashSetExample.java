import java.util.HashSet;
import java.util.Arrays;

/**
 * HashSet: Best for unique elements and fast membership check
 * Use Case: Remove duplicates, Check existence
 */
public class HashSetExample {
    public static void main(String[] args) {
        System.out.println("=== HASHSET EXAMPLE ===\n");

        // ========== Remove Duplicates ==========
        System.out.println("--- Remove Duplicates ---");
        Integer[] numbers = {1, 2, 2, 3, 4, 4, 4, 5, 1, 3};
        System.out.println("Original: " + Arrays.toString(numbers));

        HashSet<Integer> uniqueNumbers = new HashSet<>(Arrays.asList(numbers));
        System.out.println("Unique: " + uniqueNumbers);

        // ========== Fast Membership Check ==========
        System.out.println("\n--- Fast Membership Check ---");
        HashSet<String> validUsers = new HashSet<>();
        validUsers.add("admin");
        validUsers.add("user1");
        validUsers.add("user2");

        System.out.println("Valid users: " + validUsers);

        String[] loginAttempts = {"admin", "hacker", "user1"};
        for (String user : loginAttempts) {
            if (validUsers.contains(user)) {
                System.out.println("  " + user + ": ✓ Access granted");
            } else {
                System.out.println("  " + user + ": ✗ Access denied");
            }
        }

        // ========== Set Operations ==========
        System.out.println("\n--- Set Operations ---");
        HashSet<String> setA = new HashSet<>(Arrays.asList("Java", "Python", "C++"));
        HashSet<String> setB = new HashSet<>(Arrays.asList("Python", "Ruby", "Go"));

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);

        // Union (A ∪ B)
        HashSet<String> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println("Union: " + union);

        // Intersection (A ∩ B)
        HashSet<String> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection: " + intersection);

        // Difference (A - B)
        HashSet<String> difference = new HashSet<>(setA);
        difference.removeAll(setB);
        System.out.println("Difference (A-B): " + difference);

        // ========== Basic Operations ==========
        System.out.println("\n--- Basic Operations ---");
        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");  // Duplicate - ignored

        System.out.println("Fruits: " + fruits);
        System.out.println("Size: " + fruits.size());
        System.out.println("Contains 'Apple'? " + fruits.contains("Apple"));

        fruits.remove("Banana");
        System.out.println("After remove: " + fruits);
    }
}