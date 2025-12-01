public class MultipleCatchExample {
    public static void main(String[] args) {

        try {
            int[] numbers = {1, 2, 3};

            // This might throw ArithmeticException
            int result = 10 / 0;

            // This might throw ArrayIndexOutOfBoundsException
            System.out.println(numbers[5]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error: " + e.getMessage());

        } catch (Exception e) {
            // Generic catch - catches all other exceptions
            System.out.println("Some error occurred: " + e.getMessage());
        }

        // same thing can be written as:
        // catch (ArithmeticException | ArrayIndexOutOfBoundsException | Exception e)
    }
}