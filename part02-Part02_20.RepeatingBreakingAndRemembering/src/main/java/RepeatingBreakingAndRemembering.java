
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        int num,sum = 0,count = 0,even = 0,odd = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the numbers:");

        while (true) {
            num = Integer.valueOf(scanner.nextLine());

            if (num == -1) {
                break;
            }

            sum = sum + num;
            count = count + 1;

            if (num%2 == 0) {
                even = even + 1;
            }else{
                odd = odd + 1;
            }
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (double)sum/count);
        System.out.println("Even: " + even);
        System.out.println("Odd: "+odd);
    }
}
