import java.io.*;

public class ThrowsExample {

    // Declaring that this method might throw IOException
    public static void readFile(String filename) throws IOException {
        FileReader file = new FileReader(filename);
        BufferedReader reader = new BufferedReader(file);
        System.out.println(reader.readLine());
        reader.close();
    }

    public static void main(String[] args) {
        try {
            readFile("test.txt");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}