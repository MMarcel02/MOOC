import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeList {
    private ArrayList<Recipe> recipes;

    public RecipeList() {
        this.recipes = new ArrayList<>();
    }

    public void loadRecipes(String recipePath) {
        try (Scanner fileReader = new Scanner(Paths.get(recipePath))) {
            while (fileReader.hasNextLine()) {
                String name = fileReader.nextLine().trim();
                int cookingTime = Integer.parseInt(fileReader.nextLine().trim());

                ArrayList<String> ingredients = new ArrayList<>();
                while (fileReader.hasNextLine()) {
                    String line = fileReader.nextLine().trim();
                    if (line.isEmpty()) {
                        break;
                    }
                    ingredients.add(line);
                }
                Recipe recipe = new Recipe(name, cookingTime, ingredients);
                recipes.add(recipe);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public ArrayList<Recipe> searchRecipesName(String searchWord) {
        ArrayList<Recipe> filteredRecipes = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(searchWord)) {
                filteredRecipes.add(recipe);
            }
        }
        return filteredRecipes;
    }

    public ArrayList<Recipe> searchRecipesCookingTime(int cookingTime) {
        ArrayList<Recipe> filteredRecipes = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= cookingTime) {
                filteredRecipes.add(recipe);
            }
        }
        return filteredRecipes;
    }

    public ArrayList<Recipe> searchRecipesIngredient(String ingredient) {
        ArrayList<Recipe> filteredRecipes = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                filteredRecipes.add(recipe);
            }
        }
        return filteredRecipes;
    }
}
