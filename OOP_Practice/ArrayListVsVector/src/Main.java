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

    public static int getArrayListCapacity(ArrayList<?> list) throws Exception {
        // Get the class of the ArrayList.
        Field elementDataField = ArrayList.class.getDeclaredField("elementData");

        // Make the private "elementData" field accessible.
        elementDataField.setAccessible(true);

       
        return ((Object[]) elementDataField.get(list)).length;
    }
}