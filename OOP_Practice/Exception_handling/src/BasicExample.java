public class BasicExample {
    public static void main(String[] args) {

        try {
            // Risky code that might throw exception
            int result = 10 / 0;
            System.out.println(result);

        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Cannot divide by zero!");
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println("Program continues...");
        }


    }
}