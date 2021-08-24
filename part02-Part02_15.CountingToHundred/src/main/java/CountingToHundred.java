
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int num = Integer.valueOf(scanner.nextLine()); num <= 100; num++) {
            System.out.println(num);
        }

    }
}
