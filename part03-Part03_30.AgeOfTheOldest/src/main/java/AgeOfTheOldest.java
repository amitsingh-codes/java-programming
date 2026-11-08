
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max_age = 0;

        while (true) {
            String name_age = scanner.nextLine();

            if (name_age.equals("")) {
                break;
            }

            String[] users = name_age.split(",");

            int age = Integer.valueOf(users[1]);

            if (age > max_age) {
                max_age = age;
            }
        }

        System.out.println("Age of the oldest: " + max_age);
    }
}
