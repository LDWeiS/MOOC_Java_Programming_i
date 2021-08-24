
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        int count = 1;
        
        if (num == 0) {
            System.out.println("Factorial: 1" );
        }
        
        for (int i = 1; i <= num; i++) {
            count *= i;
        }
        
        System.out.println("Factorial: " + count);

    }
}
