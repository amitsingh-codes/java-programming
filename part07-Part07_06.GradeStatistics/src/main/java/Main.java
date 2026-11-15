
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == -1) {
                break;
            }

            if (num >= 0 && num <=100) {
                marks.add(num);
            }
        }

        
        ResultStatistics result = new ResultStatistics(marks);

        System.out.println("Point average (all): "+result.getAvg());
        System.out.println("Point average (passing): " + result.getAvgPassing());
        System.out.println("Pass percentage: " + result.getPassPercentage());
        System.out.println("Grade distribution: " );
        result.pritGradeStars();
    }
}
