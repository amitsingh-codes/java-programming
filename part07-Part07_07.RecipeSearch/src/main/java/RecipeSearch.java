
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();

        System.out.print("File to read: ");
        String fileName = reader.nextLine();

        // Read recipes from file
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {

            while (scanner.hasNextLine()) {

                String name = scanner.nextLine();

                if (name.isEmpty()) {
                    continue;
                }

                int cookingTime = Integer.valueOf(scanner.nextLine());

                ArrayList<String> ingredients = new ArrayList<>();

                while (scanner.hasNextLine()) {

                    String ingredient = scanner.nextLine();

                    if (ingredient.isEmpty()) {
                        break;
                    }

                    ingredients.add(ingredient);
                }

                Recipe recipe = new Recipe(name, cookingTime, ingredients);
                recipes.add(recipe);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // User interface
        System.out.println();
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {

            System.out.print("Enter command: ");
            String command = reader.nextLine();

            if (command.equals("stop")) {
                break;
            }

            // List all recipes
            if (command.equals("list")) {

                System.out.println("Recipes:");

                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            }

            // Find recipes by name
            if (command.equals("find name")) {

                System.out.print("Searched word: ");
                String searchWord = reader.nextLine();

                System.out.println("Recipes:");

                for (Recipe recipe : recipes) {

                    if (recipe.getName().contains(searchWord)) {
                        System.out.println(recipe);
                    }
                }
            }

            // Find recipes by cooking time
            if (command.equals("find cooking time")) {

                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(reader.nextLine());

                System.out.println("Recipes:");

                for (Recipe recipe : recipes) {

                    if (recipe.getCookingTime() <= maxTime) {
                        System.out.println(recipe);
                    }
                }
            }

            // Find recipes by ingredient
            if (command.equals("find ingredient")) {

                System.out.print("Ingredient: ");
                String searchIngredient = reader.nextLine();

                System.out.println("Recipes:");

                for (Recipe recipe : recipes) {

                    if (recipe.getIngredients().contains(searchIngredient)) {
                        System.out.println(recipe);
                    }
                }
            }
        }
    }
}
