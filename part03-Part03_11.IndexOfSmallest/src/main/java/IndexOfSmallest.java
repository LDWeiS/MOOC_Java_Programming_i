
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 9999) {
                break;
            }

            list.add(num);
        }
        
        smallestNum(list);

        // implement here a program that reads user input
        // until the user enters 9999
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
    }

    public static void smallestNum(ArrayList<Integer> list) {
        int min = 9999;

        for (int num : list) {
            if (num <= min) {
                min = num;
            }
        }
        System.out.println("Smallest number: " + min);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == min) {
                System.out.println("Found at index:" + i);
            }
        }
    }

}
