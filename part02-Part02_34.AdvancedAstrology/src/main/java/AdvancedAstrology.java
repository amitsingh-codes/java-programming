
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }

    }

    public static void printTriangle(int size) {
        int j = 1;
        for (int i = (size-1); i >= 0; i--) {
            printSpaces(i);
            printStars(j);
            j++;
        }
    }

    public static void christmasTree(int height) {
        int j = 1;
        for (int i = (height - 1); i >= 0; i--) {
            printSpaces(i);
            printStars(j);
            j = j + 2;
        }

        for(int k = 1;k <=2;k++){
            printSpaces(j/2-2);
            printStars(3);
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
