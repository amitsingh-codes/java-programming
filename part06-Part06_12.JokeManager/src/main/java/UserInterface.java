import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager manager;

    public UserInterface( JokeManager manager,Scanner scanner){
        this.scanner = scanner;
        this.manager = manager;
    }

    public void start(){
        while (true) {
            System.out.println("Commands:\n" + 
                            "1 - add a joke\n" + 
                            "2 - draw a joke\n" + 
                            "3 - list jokes\n" + 
                            "X - stop");
            String command = scanner.nextLine();
            if (command.equals("1")) {
                add();
            }

            if (command.equals("2")) {
                draw_joke();
            }

            if (command.equals("3")) {
                jokes();
            }

            if (command.equals("X")) {
                return ;
            }
        }
    }

    public void add(){
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        this.manager.addJoke(joke);
    }

    public void draw_joke(){
        System.out.println(this.manager.drawJoke());
    }

    public void jokes(){
        System.out.println("Printing the jokes.");
        this.manager.printJokes();
    }
}
