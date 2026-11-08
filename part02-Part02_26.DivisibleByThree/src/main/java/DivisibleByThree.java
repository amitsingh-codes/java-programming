
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        
        int start = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Enter the last number:");
        
        int end = Integer.valueOf(scanner.nextLine());

        divisibleByThreeInRange(start,end);
    }

    public static void divisibleByThreeInRange(int start,int end){
        for(;start<=end;start++){
            if (start%3==0) {
                System.out.println(start);
            }
        }
    }

}
