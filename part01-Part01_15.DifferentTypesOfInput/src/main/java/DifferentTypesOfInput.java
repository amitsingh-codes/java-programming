
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");

        String text = scan.nextLine();

        System.out.println("Give an integer:");

        int number = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double:");

        double db = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean:");

        boolean bl = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + text);

        System.out.println("You gave the integer " + number);

        System.out.println("You gave the double " + db);

        System.out.println("You gave the boolean " + bl);

    }
}
