
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                maxNum(list);
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
    }
    
    public static void maxNum(ArrayList<Integer> list){
        int max = 0;
        
        for (int num : list){
            if (num > max){
                max = num;
            }
        }
        
        System.out.println("The greatest number: " + max);
    }
}
