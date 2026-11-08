public class Timer {
    private ClockHand second;
    private ClockHand hund_second;
    public Timer(){
        this.second = new ClockHand(60);
        this.hund_second = new ClockHand(100);
    }

    public void advance(){
        this.hund_second.advance();

        if (this.hund_second.value() == 0) {
            this.second.advance();
        }

    }

    public String toString(){
        return this.second + ":" + this.hund_second;
    }
}
