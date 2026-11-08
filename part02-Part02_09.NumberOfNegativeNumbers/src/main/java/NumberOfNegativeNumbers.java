
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int count = 0,number ;

        while (true) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }else if (number < 0) {
                count = count + 1;   
            }else{
                continue;
            }
        }

        System.out.println("Number of negative numbers: " + count);
    }

}
