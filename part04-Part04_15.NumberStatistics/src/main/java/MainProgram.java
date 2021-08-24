
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        
        System.out.println("Enter numbers:");
        
        while (true){
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == -1){
                break;
            } else if (num % 2 == 0){
                even.addNumber(num);
            } else {
                odd.addNumber(num);
            }
            
            statistics.addNumber(num);
        }
        
        
//        Statistics statistics = new Statistics();
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
//        System.out.println("Average: " + statistics.average());
    }
}
