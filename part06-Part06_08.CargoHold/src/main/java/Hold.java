import java.util.ArrayList;

public class Hold {
    private int max_weight;
    private ArrayList<Suitcase> suitcases; 
    private int total_weight;


    public Hold(int max_weight){
        this.max_weight = max_weight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        this.total_weight = this.total_weight + suitcase.totalWeight(); 
        if (max_weight >= this.total_weight) {   
            this.suitcases.add(suitcase);
        }else{
            this.total_weight = this.total_weight - suitcase.totalWeight(); 
        }
    }

    public void printItems(){
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }

    // method public String toString() that returns the string "x suitcases (y kg)"
    public String toString(){
        return this.suitcases.size() +" suitcases (" + this.total_weight + "kg)";  
    }
}
