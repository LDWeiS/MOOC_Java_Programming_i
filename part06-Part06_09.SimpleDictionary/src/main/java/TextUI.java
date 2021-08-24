
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
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {
        
        System.out.print("Command: ");
        String commandIn = this.scanner.nextLine();

        if (commandIn.equals("end")) {

            System.out.println("Bye bye!");
            return;

        } else if (commandIn.equals("add")) {

            System.out.print("Word: ");
            String wordIn = this.scanner.nextLine();
            
            System.out.print("Translation: ");
            String transIn = this.scanner.nextLine();
            
            this.dict.add(wordIn, transIn);
            this.start();

        } else if (commandIn.equals("search")) {

            System.out.print("To be translated: ");
            String searchIn = this.scanner.nextLine();

            if (this.dict.translate(searchIn) == null) {
                
                System.out.println("Word " + searchIn + " was not found");
                
            } else {
                
                System.out.println("Translation: " + this.dict.translate(searchIn));
            }
            
            this.start();

        } else {

            System.out.println("Unknown command");
            this.start();

        }

    }

}
