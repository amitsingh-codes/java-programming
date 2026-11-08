
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number :");

        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the second number :");

        int num2 = Integer.valueOf(scanner.nextLine());

        double sqr = Math.sqrt(num1 + num2);

        System.out.println(sqr);
    }
}
