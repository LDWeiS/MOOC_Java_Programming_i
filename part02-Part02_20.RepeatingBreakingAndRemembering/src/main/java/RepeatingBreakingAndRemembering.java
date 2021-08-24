
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        double sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num != -1){
                sum += num;
                count ++;
                if (num % 2 == 0){
                    even ++;
                }
            } else {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + (int) sum);
                System.out.println("Numbers: " + (int)count);
                System.out.println("Average: " + (double) (sum/count));
                System.out.println("Even: " + (int) even);
                System.out.println("Odd: " + (int) (count-even));
                break;
            }
        }
        

    }
}
