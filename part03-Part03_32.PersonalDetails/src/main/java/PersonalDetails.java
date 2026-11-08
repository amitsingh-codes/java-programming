
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0 , length = 0 , count = 0;
        String long_name = "";

        while (true) {
            String name_dob = scanner.nextLine();

            if (name_dob.equals("")) {
                break;
            }

            String[] details = name_dob.split(",");

            if (details[0].length() > length) {
                length = details[0].length();
                long_name = details[0];
            }

            sum = sum + Integer.valueOf(details[1]);
            count++;
            
        }

        System.out.println("Longest name: " + long_name);
        System.out.println("Average of the birth years: " + (double)sum/count);

    }
}
