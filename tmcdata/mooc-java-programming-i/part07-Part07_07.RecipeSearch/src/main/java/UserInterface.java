import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    private RecipeList recipeList;

    public void listRecipes(ArrayList<Recipe> recipes) {
        System.out.println("\nRecipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTime());
        }
        System.out.println();
    }

    public ArrayList<Recipe> searchRecipesByName(RecipeList recipes) {
        System.out.print("Searched word: ");
        String searchWord = scanner.nextLine();
        return recipes.searchRecipesName(searchWord);
    }

    public ArrayList<Recipe> searchRecipesByCookingTime(RecipeList recipes) {
        System.out.print("Max cooking time: ");
        int cookingTime = Integer.parseInt(scanner.nextLine());
        return recipes.searchRecipesCookingTime(cookingTime);
    }

    public ArrayList<Recipe> searchRecipesByIngredient(RecipeList recipes) {
        System.out.print("Ingredient: ");
        String searchWord = scanner.nextLine();
        return recipes.searchRecipesIngredient(searchWord);
    }

    public void run() {
        System.out.print("File to read: ");
        String recipeFileName = scanner.nextLine();
        System.out.println();

        recipeList = new RecipeList();
        recipeList.loadRecipes(recipeFileName);
        ArrayList<Recipe> recipes = recipeList.getRecipes();

        System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program\nfind name - searches recipes by name\n" + 
        "find cooking time - searches recipes by cooking time\nfind ingredient - searches recipes by ingredient\n");

        boolean running = true;
        while (running) {

            System.out.print("Enter command: ");
            String command = scanner.nextLine();
    
            switch (command) {
                case "list":
                    listRecipes(recipes);
                    break;
                case "find name":
                    listRecipes(searchRecipesByName(recipeList));
                    break;
                case "find cooking time":
                    listRecipes(searchRecipesByCookingTime(recipeList));
                    break;
                case "find ingredient":
                    listRecipes(searchRecipesByIngredient(recipeList));
                    break;
                case "stop":
                    running = false;
                    break;
                default:
                    System.out.println("Unknown command.");
            }
        }
    }

}
