
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
public class Stack {
    
    private ArrayList dataSet;
    
    public Stack(){
        this.dataSet = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return (this.dataSet.isEmpty());
    }
    
    public void add(String value){
        this.dataSet.add(0, value);
    }
    
    public ArrayList<String> values(){
        return this.dataSet;
    }
    
    public String take(){
        String temp = this.dataSet.get(0).toString();
        this.dataSet.remove(0);
        return temp;
    }
    
}
