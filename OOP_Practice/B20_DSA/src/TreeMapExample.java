import java.util.TreeMap;

/**
 * TreeMap: Best for sorted keys and range queries
 * Use Case: Dictionary, Leaderboard, Schedule
 */
public class TreeMapExample {
    public static void main(String[] args) {
        System.out.println("=== TREEMAP EXAMPLE: Leaderboard ===\n");

        // Scores sorted in ascending order (default)
        TreeMap<Integer, String> leaderboard = new TreeMap<>();

        leaderboard.put(85, "Charlie");
        leaderboard.put(92, "Alice");
        leaderboard.put(78, "David");
        leaderboard.put(95, "Eve");
        leaderboard.put(88, "Bob");

        System.out.println("Leaderboard (sorted by score): " + leaderboard);

        // First and Last
        System.out.println("\nLowest score: " + leaderboard.firstKey() +
                " - " + leaderboard.get(leaderboard.firstKey()));
        System.out.println("Highest score: " + leaderboard.lastKey() +
                " - " + leaderboard.get(leaderboard.lastKey()));

        // Range queries
        System.out.println("\n--- Range Queries ---");
        System.out.println("Scores >= 85: " + leaderboard.tailMap(85));
        System.out.println("Scores < 90: " + leaderboard.headMap(90));
        System.out.println("Scores 80-90: " + leaderboard.subMap(80, 91));

        // Floor and Ceiling
        System.out.println("\n--- Floor & Ceiling ---");
        System.out.println("Floor of 90: " + leaderboard.floorKey(90));    // <= 90
        System.out.println("Ceiling of 90: " + leaderboard.ceilingKey(90)); // >= 90

        // Dictionary example
        System.out.println("\n=== DICTIONARY EXAMPLE (Sorted Keys) ===");
        TreeMap<String, String> dictionary = new TreeMap<>();

        dictionary.put("cat", "a small pet");
        dictionary.put("apple", "a fruit");
        dictionary.put("dog", "a loyal pet");
        dictionary.put("banana", "yellow fruit");

        System.out.println("Dictionary (alphabetical): " + dictionary);

        // Words starting with 'a' to 'c'
        System.out.println("Words 'a' to 'c': " + dictionary.subMap("a", "c"));
    }
}