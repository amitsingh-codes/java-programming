import java.util.Scanner;

public class TextUI {
    private Scanner Scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.Scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Commnand:");
            String text = Scanner.nextLine();
            if (text.equals("end")) {
                System.out.println("Bye bye!");
                return ;
            }

            if (text.equals("add")) {
                add();
                continue;
            }

            if (text.equals("search")) {
                System.out.println(search());
                continue;
            }

            System.out.println("unknown command");
        }
    }

    public void add() {
        System.out.print("Word:");
        String word = Scanner.nextLine();
        System.out.print("Translation:");
        String Translation = Scanner.nextLine();
        this.simpleDictionary.add(word, Translation);
    }

    public String search(){
        System.out.print("To be translated:");
        String word = Scanner.nextLine();
        if (this.simpleDictionary.translate(word) == null) {
            return "Word "+ word +" was not found";
        }
        return "Translation : " + this.simpleDictionary.translate(word); 
    }

}
