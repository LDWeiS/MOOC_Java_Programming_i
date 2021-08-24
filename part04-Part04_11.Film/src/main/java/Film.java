/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick Woi
 */
public class Film {
    
    private String name;
    private int age;
    
    public Film(String filmName, int filmAgeRating){
        this.name = filmName;
        this.age = filmAgeRating;
    }
    
    public int ageRating(){
        return this.age;
    }
    
    public String name(){
        return this.name;
    }
}
