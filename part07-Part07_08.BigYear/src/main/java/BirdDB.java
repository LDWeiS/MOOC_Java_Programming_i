
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
public class BirdDB {
    
    private ArrayList<Bird> birdManager;
    
    public BirdDB(){
        this.birdManager = new ArrayList<>();
    }
    
    public void add(Bird name) {
        this.birdManager.add(name);
    }
    
    public void addObserve(String name) {
        boolean found = false;
        
        for (Bird bird:birdManager){
            if (bird.getName().equals(name)) {
                bird.addObs();
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Not a bird!");
        }
    }
    
    public void printBird() {
        for (Bird bird:birdManager){
            System.out.println(bird.getName() + "(" + bird.getLatin() + "): " + bird.getCount() + " observations");
        }
    }
    
    public void printBird(String name) {
        for (Bird bird:birdManager){
            if (bird.getName().equals(name))
            System.out.println(bird.getName() + "(" + bird.getLatin() + "): " + bird.getCount() + " observations");
        }
    }
    
}
