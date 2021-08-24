
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
public class Suitcase {
    
    private ArrayList<Item> things;
    private int maxWeight;
    private int currentWeight;
    
    public Suitcase(int maxWeight){
        this.things = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }
    
    public void addItem(Item item){
        if (this.maxWeight - this.currentWeight >= item.getWeight()){
            this.things.add(item);
            this.currentWeight += item.getWeight();
        } else {
            return;
        }
    }
    
    @Override
    public String toString(){
        if (this.things.isEmpty()){
            return "no items(" + this.currentWeight + " kg)";
        } else if (this.things.size() == 1){
            return this.things.size() + " item(" + this.currentWeight + " kg)";
        } else {
            return this.things.size() + " items(" + this.currentWeight + " kg)";
        }

    }
    
    public void printItems(){
        for (Item thing:things){
            System.out.println(thing);
        }
    }
    
    public int totalWeight(){
        return this.currentWeight;
    }
    
    public Item heaviestItem(){
        if (things.isEmpty()){
            return null;
        }
        
        Item heaviest = things.get(0);
        
        for (Item thing:things){
            if(thing.getWeight() > heaviest.getWeight()){
                heaviest = thing;
            }
        }
        
        return heaviest;
    }
    
}
