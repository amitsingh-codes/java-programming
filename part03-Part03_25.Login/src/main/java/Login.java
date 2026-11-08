
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user1 = "alex";
        String password1 = "sunshine";
        String user2 = "emma";
        String password2 = "haskell";

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();


        if (username.equals(user1)) {
            if (password.equals(password1)) {
                System.out.println("You have successfully logged in!");
            }
        }else if (username.equals(user2)) {
            if (password.equals(password2)) {
                System.out.println("You have successfully logged in!");
            }
        }else{
            System.out.println("Incorrect username or password!");
        }

    }
}
