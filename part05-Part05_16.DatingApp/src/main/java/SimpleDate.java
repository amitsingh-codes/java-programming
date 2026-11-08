
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {

        if (!(this.day <= 30 && this.month <= 12)) {
            System.out.println("invalid date");
        }else{
            if (this.day < 30) {
                this.day = this.day + 1;
            } else {
                if (month < 12) {
                    this.month = this.month + 1;
                    this.day = 1;
                } else {
                    this.year = this.year + 1;
                    this.month = 1;
                    this.day = 1;
                }
            }
        }
    }

    public void advance(int howManyDays) {

        if (!(this.day <= 30 && this.month <= 12)) {
            System.out.println("invalid date");
        } else {
            for (int i = 1; i <= howManyDays; i++) {
                this.day++;
                if (this.day == 31) {
                    this.day = 1;
                    this.month = this.month + 1;
                    if (this.month == 13) {
                        this.month = 1;
                        this.year = this.year + 1;
                    }
                }
            }
        }

        // if (this.day < 30) {
        // for(int i = 1 ; i<= howManyDays ; i++){
        // this.day ++;
        // if (this.day == 31) {
        // this.day = 1;
        // this.month = this.month + 1;
        // }
        // }
        // }else{
        // if (this.month < 12) {
        // if (howManyDays >=30) {
        // this.month = this.month + (int) howManyDays/30;
        // }else{
        // this.month = this.month + 1;
        // this.day = howManyDays;
        // }
        // }
        // else{
        // if (howManyDays >=365) {
        // this.year = this.year + (int)howManyDays/365;
        // }else{
        // this.year = this.year + 1;
        // if (howManyDays < 30) {
        // this.month = 1;
        // }else{
        // this.month = (int)howManyDays/30;
        // }
        // // this.day = 1;
        // }
        // }
        // }
    }

    public SimpleDate afterNumberOfDays(int days){
        SimpleDate adv_Date = new SimpleDate(this.day, this.month, this.year);
        
        adv_Date.advance(days);

        return adv_Date;
    }
}
