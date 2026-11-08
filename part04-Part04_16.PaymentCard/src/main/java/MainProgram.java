import  java.util.Scanner;;
public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        PaymentCard pauCard = new PaymentCard(20);
        PaymentCard mattCard = new PaymentCard(30);

        pauCard.eatHeartily();
        mattCard.eatAffordably();

        System.out.println("Paul: " + pauCard);
        System.out.println("Matt: " + mattCard);

        pauCard.addMoney(20);

        mattCard.eatHeartily();

        System.out.println("Paul: " + pauCard);
        System.out.println("Matt: " + mattCard);

        pauCard.eatAffordably();;

        pauCard.eatAffordably();;

        mattCard.addMoney(50);

        System.out.println("Matt: " + mattCard);
        System.out.println("Paul: " + pauCard);

    }
}
