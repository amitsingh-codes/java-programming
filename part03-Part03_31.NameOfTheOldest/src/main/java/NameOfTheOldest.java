
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max_age = 0;
        String name_oldest = "";

        while (true) {
            String name_age = scanner.nextLine();

            if (name_age.equals("")) {
                break;
            }

            String[] users = name_age.split(",");
            // System.out.println(users[0]);
            // System.out.println(users[1]);

            int age = Integer.valueOf(users[1]);
            // System.out.println(age);

            if (age > max_age) {
                max_age = age;
                // System.out.println(max_age);
                name_oldest = users[0]; 
                // System.out.println(name_oldest);
            }
        }

        System.out.println("Name of the oldest: " + name_oldest);
        // System.out.println(max_age);
    }
}
