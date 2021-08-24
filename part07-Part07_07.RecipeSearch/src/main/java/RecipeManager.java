
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick Woi
 */
public class RecipeManager {
    
    private ArrayList<Recipe> recipes;
    
    public RecipeManager(){
        this.recipes = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe){
        this.recipes.add(recipe);
    }
    
    public void listRecipes(){
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe:recipes) {
            System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
        }
        System.out.println("");
        
    }
    
    public void findRecipe(String searchWord){
        System.out.println("");
        System.out.println("Recipes: ");
        
        for (Recipe recipe:recipes) {
            if (recipe.getName().contains(searchWord)) {               
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
            }
        }
        System.out.println("");
    }
    
    public void findTime(int searchTime){
        System.out.println("");
        System.out.println("Recipes: ");
        
        for (Recipe recipe:recipes) {
            if (recipe.getTime() <= searchTime) {               
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
            }
        }
        System.out.println("");
    }
    
    public void findIng(String searchIngredient){
        System.out.println("");
        System.out.println("Recipes: ");
        
        for (Recipe recipe:recipes) {
            if (recipe.getIng().contains(searchIngredient)) {               
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
            }
        }
        System.out.println("");
    }
    
}   
