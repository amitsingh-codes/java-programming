
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        if (!(text.equals("true"))) {
            System.out.println("Try again!");
        }else{
            System.out.println("You got it right!");
        }

    }
}
