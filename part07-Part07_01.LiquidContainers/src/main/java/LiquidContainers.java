
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 = 0;
        int container2 = 0;
        int maxVolume = 100;


        while (true) {
            System.out.println("First: " + container1 + "/" + maxVolume);
            System.out.println("Second: " + container2 + "/" + maxVolume);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String comIn = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (comIn.equals("add")) {
                if (amount > 0){
                    
                    container1 += amount;
                }
                
                if (container1 > maxVolume){
                    
                    container1 = maxVolume;
                    
                }
                
            } else if (comIn.equals("move")){
                
                if (amount < 0) {
                    
                    System.out.println("");
                    continue;
                    
                }
                
                if (container1 >= amount) {
                    
                    container1 -= amount;
                    container2 += amount;
                    
                } else if (container1 < amount){
                    
                    container2 += container1;
                    container1 = 0;
                }
                
                if (container2 > maxVolume) {
                    
                    container2 = maxVolume;
                }
                
            } else if (comIn.equals("remove")){
                
                if (container2 < amount) {
                    
                    container2 = 0;
                    
                } else {
                    
                    container2 -= amount;
                    
                }
            }
            
            System.out.println("");
            
        }
    }
}
