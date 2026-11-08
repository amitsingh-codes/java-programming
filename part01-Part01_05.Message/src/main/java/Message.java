import java.util.Scanner;
public class Message{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the message : ");

        String message = scanner.nextLine();

        System.out.println(message);

        scanner.close();

        // will not take inpout now 

        // String message2 = scanner.nextLine();

        // System.out.println(message2);
    }
}