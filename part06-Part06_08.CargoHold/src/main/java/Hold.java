
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
public class Hold {
    
    private int maxWeight;
    private int currentHold;
    private ArrayList<Suitcase> container;
    
    public Hold (int maxWeight) {
        this.maxWeight = maxWeight;
        this.currentHold = 0;
        this.container = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(this.maxWeight-this.currentHold >= suitcase.totalWeight()){
            this.container.add(suitcase);
            this.currentHold += suitcase.totalWeight();
        }
    }
    
    @Override
    public String toString(){
        return this.container.size() + " suitcases (" + this.currentHold + " kg)";
    }
    
    public void printItems(){
        for(Suitcase suitcase:container) {
            suitcase.printItems();
        }
    }
    
}
