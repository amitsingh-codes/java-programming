
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {

        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Last number? ");

        int num = Integer.valueOf(scanner.nextLine());

        for(int i=1; i<=num ; i++){
            sum = sum + i;
        }

        System.out.println("The sum is " + sum);

    }
}
