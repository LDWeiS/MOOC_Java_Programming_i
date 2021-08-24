
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdDB manager = new BirdDB();
        
        while(true) {
            System.out.print("? ");
            String comIn = scan.nextLine();

            if (comIn.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String nameLatin = scan.nextLine();

                Bird newBird = new Bird(name, nameLatin);

                manager.add(newBird);
                
            } else if (comIn.equals("Observation")) {
                System.out.print("Bird? ");
                String birdName = scan.nextLine();

                manager.addObserve(birdName);
                
            } else if (comIn.equals("All")) {
                manager.printBird();
                
            } else if (comIn.equals("One")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                manager.printBird(name);
                
            } else if (comIn.equals("Quit")) {
                break;
                
            } else {
                System.out.println("Unknown command!");
            }
        }
    }
}