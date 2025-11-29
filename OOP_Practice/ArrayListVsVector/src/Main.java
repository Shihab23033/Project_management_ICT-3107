import java.lang.reflect.Field;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        // 1. Create an ArrayList with a small initial capacity of 3.
        ArrayList<Integer> list = new ArrayList<>(3);

        System.out.println("--- Demonstrating ArrayList Growth (Increases by 50%) ---");
        System.out.println("Initial State -> Size: " + list.size() + ", Capacity: " + getArrayListCapacity(list));
        System.out.println("---------------------------------------------------------");

        // 2. Add elements to the list one by one.
        // We will add 10 elements to trigger the capacity increase multiple times.
        for (int i = 1; i <= 10; i++) {
            list.add(i);
            System.out.println("Added element " + i + " -> Size: " + list.size() + ", Capacity: " + getArrayListCapacity(list));
        }
    }

    /**
     * A helper method to get the current capacity of an ArrayList using reflection.
     * Capacity is a private implementation detail, so we must "reflect" to see it.
     *
     * @param list The ArrayList to inspect.
     * @return The current capacity of the list's internal array.
     * @throws Exception if reflection fails.
     */
    public static int getArrayListCapacity(ArrayList<?> list) throws Exception {
        // Get the class of the ArrayList.
        Field elementDataField = ArrayList.class.getDeclaredField("elementData");

        // Make the private "elementData" field accessible.
        elementDataField.setAccessible(true);

        // Get the value of the "elementData" field (which is the internal array)
        // and return its length.
        return ((Object[]) elementDataField.get(list)).length;
    }
}