
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = 0;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            
            String[] inputArr = input.split(",");
            if (Integer.valueOf(inputArr[1]) > age){
                age = Integer.valueOf(inputArr[1]);
                name = inputArr[0];
            }
        }
        
        System.out.println("Name of the oldest: " + name);


    }
}
