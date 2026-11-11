import java.security.PublicKey;

public class Item {
    private String name;
    private int weight;
    // Constructor that takes the name and the weight of the item as parameter
    public Item(String name , int weight){
        this.name = name;
        this.weight = weight;
    }

    // Method public String getName(), which returns the item's name
    public String getName(){
        return this.name;
    }

    // Method public int getWeight(), which returns the item's weight
    public int getWeight(){
        return this.weight;
    }

    // Method public String toString(), which returns the string "name (weight kg)"
    public String toString(){
        return this.name + " (" + this.weight + " kg)";
    }
}
