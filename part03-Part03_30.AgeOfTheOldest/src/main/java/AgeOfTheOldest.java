
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = 0;
        int age = 0;

        while (true){
            String nAge = scanner.nextLine();
            
            if (nAge.equals("")){
                break;
            }
            
            age = parseAge(nAge);
            
            if (age > maxAge){
                maxAge = age;
            }
            
        }
        
        System.out.println("Age of the oldest: " + maxAge);
    }
    
    public static int parseAge(String nAge){
        String[] ageArray = nAge.split(",");
        
        return Integer.valueOf(ageArray[1]);
    }
}
