import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);

        System.out.println("Enter the numerator :");

        int num = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the denominator");

        int den = Integer.valueOf(scanner.nextLine());

        division(num, den);
        
    }

    public static void division(int numerator, int denominator){
        System.out.println((double)numerator/denominator);
    }
}
