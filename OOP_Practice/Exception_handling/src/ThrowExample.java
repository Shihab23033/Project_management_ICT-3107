public class ThrowExample {

    public static void validateAge(int age) {
        if (age < 18) {
            // Manually throwing an exception
            throw new IllegalArgumentException("Age must be 18 or above");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}