import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int max_weight;
    private int total_weight = 0;

    // Constructor, to which the maximum weight is provided
    public Suitcase(int max_weight){
        this.items = new ArrayList<>();
        this.max_weight = max_weight;
        this.total_weight = 0;
    }
    

    // The method public void addItem(Item item), which adds the item passed as a parameter to the suitcase. The method does not return a value.
    public void addItem(Item item){
        this.total_weight = this.total_weight + item.getWeight(); 
        if (max_weight >= this.total_weight) {   
            this.items.add(item);
        }else{
            this.total_weight = this.total_weight - item.getWeight(); 
        }
    }

    public void printItems(){
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public int totalWeight(){
        return this.total_weight;
    }

    public Item heaviestItem(){
        if (this.items.isEmpty()) {
            return null;
        }

        Item hItem = this.items.get(0);

        for (Item item : items) {
            if (hItem.getWeight() < item.getWeight()) {
                hItem = item;
            }
        }

        return hItem;
    }

    // The method public String toString(), which returns the string "x items (y kg)"
    public String toString(){
        if (this.items.isEmpty()) {
            return  "no items (" + total_weight + " kg)";
        }
        if (this.items.size() == 1) {
            return this.items.size() + " item (" + total_weight + " kg)";
        }
        return this.items.size() + " items (" + total_weight + " kg)";
    }
}
