
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Last number? ");
        int num = Integer.valueOf(scanner.nextLine());
        int count = 0;
        
        for (int i = 0; i <= num; i++) {
            count += i;
        }
        
        System.out.println("The sum is " + count);

    }
}
