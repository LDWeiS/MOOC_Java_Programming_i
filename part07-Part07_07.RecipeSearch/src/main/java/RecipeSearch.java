
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeManager manager = new RecipeManager();
        ArrayList<String> lineIn = new ArrayList<>();
        ArrayList<String> recipeBuilder = new ArrayList<>();

        try {
            System.out.print("File to read: ");
            String fileName = scanner.nextLine();
            File fileIn = new File(fileName);
            Scanner fileRead = new Scanner(fileIn);
            System.out.println("");

            while (fileRead.hasNextLine()) {
                String data = fileRead.nextLine();
                lineIn.add(data);
            }

            fileRead.close();

        } catch (Exception e) {
            System.out.println("An error has occured.");
            e.printStackTrace();
        }

        for (int i = 0; i < lineIn.size(); i++) {
            if (lineIn.get(i).isEmpty() || i == lineIn.size()-1) {
                Recipe recipe = new Recipe(recipeBuilder);
                manager.addRecipe(recipe);
                recipeBuilder.clear();
            } else {
                recipeBuilder.add(lineIn.get(i));
            }
        }

        printCommands();

        while (true) {
            System.out.print("Enter command: ");
            String commandIn = scanner.nextLine();

            if (commandIn.equals("list")) {
                manager.listRecipes();

            } else if (commandIn.equals("stop")) {
                break;
                
            } else if (commandIn.equals("find name")) {
                System.out.print("Searched word: ");
                String searchWord = scanner.nextLine();
                
                manager.findRecipe(searchWord);
                
            } else if (commandIn.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int searchTime = Integer.valueOf(scanner.nextLine());
                
                manager.findTime(searchTime);
            } else if (commandIn.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String searchIngredient = scanner.nextLine();
                
                manager.findIng(searchIngredient);
            }
        }
    }

    public static void printCommands() {
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
    }

}
