
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                System.out.print("Search for? ");
                int num = Integer.valueOf(scanner.nextLine());
                searchNum(list, num);
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
    }
    
    public static void searchNum(ArrayList<Integer> list, int num) {
        for (int i= 0; i < list.size(); i++) {
            if (list.get(i) == num){
                System.out.println(num + " is at index " + i);
            }
        }
    }
}
