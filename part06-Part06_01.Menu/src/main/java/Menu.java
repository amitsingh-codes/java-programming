
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal){
        if (this.meals.contains(meal)) {
            // System.out.println("meal already exists");
        }else{
            this.meals.add(meal);
            // System.out.println(meal + "added to the menu.");
        }
    }

    public void printMeals(){
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu(){
        this.meals.clear();
    }
}
