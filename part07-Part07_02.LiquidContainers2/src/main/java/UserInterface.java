
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

    private Container container1;
    private Container container2;
    private Scanner scanner;

    public UserInterface(Container container1, Container container2, Scanner scanner) {
        this.container1 = container1;
        this.container2 = container2;        
        this.scanner = scanner;
        
    }

    public void start() {

        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String comIn = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (amount < 0) {
                System.out.println("");
                continue;
            }

            if (comIn.equals("add")) {
                container1.add(amount);

            } else if (comIn.equals("remove")) {
                container2.remove(amount);

            } else if (comIn.equals("move")) {
                if (container1.getAmount() < amount) {
                    amount = container1.getAmount();
                } 
                
                container1.remove(amount);
                container2.add(amount);
            }
            System.out.println("");
        }
    }
}
