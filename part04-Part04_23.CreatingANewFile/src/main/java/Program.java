import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        try {
            File file = new File("file.txt");
            FileWriter writer = new FileWriter(file);

            writer.write("Hello world!");

            writer.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}