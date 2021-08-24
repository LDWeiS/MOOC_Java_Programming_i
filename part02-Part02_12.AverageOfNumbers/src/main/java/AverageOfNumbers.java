
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            Double num = Double.valueOf(scanner.nextLine());
            
            if (num != 0) {
                sum += num;
                count ++;
            } else {
                System.out.println("Average of the numbers: " + (double) (sum/count));
                break;
            }
        }
    }
}
