/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick Woi
 */
public class Song {
    
    private String name;
    private int length;
    
    public Song(String songName, int songLength){
        this.name = songName;
        this.length = songLength;
    }
    
    public String name(){
        return this.name;
    }
    
    public int length(){
        return this.length;
    }
}
