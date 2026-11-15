import java.util.ArrayList;

public class ResultStatistics {
    private ArrayList<Integer> marks;
    private int sum ;
    private double count ;
    private ArrayList<Integer> gradeDistrubuted ;

    public ResultStatistics(ArrayList<Integer> marks){
        this.marks = marks;
        this.gradeDistrubuted = new ArrayList<>();
        this.sum = 0;
        this.count = 0;
    }
     // Point averages

    public double getAvg() {
        return (double)getSum()/this.marks.size();
    }

    // Point average for points giving a passing grade

    public double getAvgPassing(){
        int passing_sum = 0;
        for(int mark : this.marks){
            if (mark >=50) {
                passing_sum = passing_sum + mark;
            }
        }

        return (double) passing_sum/getPassCount();
    }

    // Pass percentage

    public double getPassPercentage(){
        return (getPassCount()/this.marks.size())*100;
    }

    public double getPassCount(){
        this.count = 0;
        for(int mark : this.marks){
            if (mark >=50) {
                this.count++;
            }
        }

        return this.count;
    }
    

    public int getSum(){
        for (int mark : this.marks) {
            this.sum = this.sum + mark;
        }

        return this.sum;
    }


    public ArrayList<Integer> gradeDistribution(){
        for(int grade : this.marks){
            if (grade>=90) {
                this.gradeDistrubuted.add(5);
            }
            else if(grade >= 80){
                this.gradeDistrubuted.add(4);
            }
            else if (grade >=70) {
                this.gradeDistrubuted.add(3);
            }
            else if (grade >=60) {
                this.gradeDistrubuted.add(2);
            }
            else if (grade >= 50){
                this.gradeDistrubuted.add(1);
            }
            else{
                this.gradeDistrubuted.add(0);
            }
        }

        return this.gradeDistrubuted;
    }

    // [0, 4, 5, 3, 2, 5]

    public void pritGradeStars(){
        gradeDistribution();
        for(int i = 5 ; i >=0 ; i--){
            int starnum = 0;
            for(int grade : this.gradeDistrubuted){
                if (grade == i) {
                    starnum++;
                }
            }

            System.out.print(i + ":");
            printStar(starnum);
            System.out.println("");
            
        }
    }

    public void printStar(int num){
        for(int i = 0 ; i < num ; i++){
            System.out.print("*");
        }
    }
}
