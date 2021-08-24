
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick Woi
 */
public class Recipe {
    
    private String name;
    private int time;
    private ArrayList<String> ingredients;
    
    public Recipe(ArrayList<String> recipeBuilder) {
        
        this.name = "";
        this.time = 0;
        this.ingredients = new ArrayList<>();
        
        for (int i = 0; i < recipeBuilder.size(); i++) {
            switch (i) {
                case 0:
                    this.name = recipeBuilder.get(i);
                    break;
                case 1:
                    this.time = Integer.valueOf(recipeBuilder.get(i));
                    break;           
                default:
                    this.ingredients.add(recipeBuilder.get(i));
                    break;
            }
        }
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getTime() {
        return this.time;
    }
    
    public ArrayList<String> getIng(){
        return this.ingredients;
    }
    
    
}
