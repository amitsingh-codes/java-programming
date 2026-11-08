
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> no_list = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();

        try(Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                int row = Integer.valueOf(reader.nextLine());
                no_list.add(row);
            }
            
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count = 0;
        
        for (int number : no_list) {
            if (number >= lowerBound && number <= upperBound) {
                count++;
            }
        }

        System.out.println("Numbers: " + count);
    }

}
