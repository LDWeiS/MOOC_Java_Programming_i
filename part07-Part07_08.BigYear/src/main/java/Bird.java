/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick Woi
 */
public class Bird {
    
    private final String name;
    private final String latin;
    private int birdCount;
    
    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.birdCount = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getLatin() {
        return this.latin;
    }
    
    public int getCount() {
        return this.birdCount;
    }
    
    public void addObs(){
        this.birdCount += 1;
    }
}
