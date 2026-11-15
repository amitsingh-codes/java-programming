import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Birds birds;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        Birds birds = new Birds();
        while (true) {
            System.out.print("?");
            String command = scanner.nextLine();
            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scanner.nextLine();
                Bird bird = new Bird(name, latinName);
                birds.add(bird);
            }

            if (command.equals("Observation")) {
                System.out.println("Bird? ");
                String name = scanner.nextLine();
                Bird foundBird = birds.getBird(name);

                if (foundBird != null) {
                    foundBird.incObservation();
                } else {
                    System.out.println("Not a bird!");
                }
            }

            if (command.equals("All")) {
                birds.printBirds();
            }

            if (command.equals("One")) {
                System.out.println("Bird? ");
                String name = scanner.nextLine();
                Bird foundBird = birds.getBird(name);

                if (foundBird != null) {
                    System.out.println(foundBird);
                } else {
                    System.out.println("Not a bird!");
                }
            }
        }
    }
}
