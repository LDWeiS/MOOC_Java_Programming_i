
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick Woi
 */
public class UserInterface {
    
    private TodoList list;
    private Scanner scan;
    
    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        this.scan = scan;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String comIn = scan.nextLine();
            
            if(comIn.equals("stop")){
                break;
            }
            
            if(comIn.equals("add")){
                System.out.print("To add: ");
                String addIn = scan.nextLine();
                this.list.add(addIn);
            }
            
            if(comIn.equals("list")){
                this.list.print();
            }
            
            if(comIn.equals("remove")){
                System.out.print("Which one is removed? ");
                int removeIn = Integer.valueOf(scan.nextLine());
                this.list.remove(removeIn);
            }
        }
    }   
}
