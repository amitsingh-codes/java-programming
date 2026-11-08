
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0,count = 0,number ;

        while (true) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }
            if (number > 0) {
                sum = sum + number;   
                count = count + 1;   
            }
        }
        if (count != 0) {
            System.out.println("Average of the numbers: " + (double)sum/count);   
        }else{
            System.out.println("Cannot calculate the average");
        }
    }
}
