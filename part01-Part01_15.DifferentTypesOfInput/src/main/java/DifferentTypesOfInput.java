
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String words = scan.nextLine();
        
        System.out.println("Give an integer:");
        Integer number = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        Double numbla = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        Boolean test = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + words);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + numbla);
        System.out.println("You gave the boolean " + test);
        
    }
}
