
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int new_euro =  this.euros + addition.euros;
        int new_cents = this.cents + addition.cents;

        Money newMoney = new Money(new_euro, new_cents); // create a new Money object that has the correct worth


        // return the new Money object
        return newMoney;
    }

    public boolean lessThan(Money compared){
        double total_money = (double) (this.euros + (this.cents*0.01));

        double compared_total_money = (double) (compared.euros + (compared.cents*0.01));


        return total_money < compared_total_money;
    }

    public Money minus(Money decreaser){
        int new_euro =  this.euros - decreaser.euros;
        int new_cents = this.cents - decreaser.cents;
        if (new_cents < 0) {
            new_cents = 100 + new_cents;
            new_euro = new_euro - 1; 
        }

        if (new_euro < 0) {
            Money newMoney = new Money(0,0);
            return newMoney;
        }else{
            Money newMoney = new Money(new_euro, new_cents); // create a new Money object that has the correct worth
            return newMoney;
        }
    }
        // return the new Money object
    




}
