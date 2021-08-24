
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            Double num = Double.valueOf(scanner.nextLine());
            
            if (num == 0 && count == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (num > 0) {
                sum += num;
                count ++;
            } else if (num ==0){
                System.out.println((double)(sum/count));
                break;
            }
        }
    }
}
