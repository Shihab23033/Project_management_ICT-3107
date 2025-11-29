import java.util.HashMap;

/**
 * HashMap: Best for fast key-value lookups (unordered)
 * Use Case: Student Grades, Word Count, Caching
 */
public class HashMapExample {
    public static void main(String[] args) {
        System.out.println("=== HASHMAP EXAMPLE: Student Grades ===\n");

        HashMap<String, Integer> grades = new HashMap<>();

        // Adding entries
        grades.put("Alice", 95);
        grades.put("Bob", 87);
        grades.put("Charlie", 92);
        grades.put("Diana", 78);

        System.out.println("All grades: " + grades);

        // Get value by key
        System.out.println("\nAlice's grade: " + grades.get("Alice"));

        // Check if key exists
        System.out.println("Contains 'Bob'? " + grades.containsKey("Bob"));
        System.out.println("Contains 'Eve'? " + grades.containsKey("Eve"));

        // Get with default value
        System.out.println("Eve's grade: " + grades.getOrDefault("Eve", 0));

        // Update value
        grades.put("Bob", 90);  // Update Bob's grade
        System.out.println("\nAfter updating Bob: " + grades);

        // Remove entry
        grades.remove("Diana");
        System.out.println("After removing Diana: " + grades);

        // Iterate over entries
        System.out.println("\n--- Iterating ---");
        for (String name : grades.keySet()) {
            System.out.println("  " + name + " -> " + grades.get(name));
        }

        // Word count example
        System.out.println("\n=== WORD COUNT EXAMPLE ===");
        String text = "apple banana apple cherry banana apple";
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : text.split(" ")) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Text: \"" + text + "\"");
        System.out.println("Word count: " + wordCount);
    }
}