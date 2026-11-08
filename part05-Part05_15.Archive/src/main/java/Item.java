public class Item {
    private String item_id;
    private String name;

    public Item(String item_id,String name){
        this.item_id = item_id;
        this.name = name;
    }

    public String getItemName(){
        return this.name;
    }

    public String getItemId(){
        return this.item_id;
    }

    public boolean equals(Object compared){
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Item)) {
            return false;
        }


        Item compareItem = (Item) compared;
        
        return this.item_id.equals(compareItem.item_id);
    }

    @Override 
    public String toString(){
        return this.item_id + ": " +this.name;
    }
}
