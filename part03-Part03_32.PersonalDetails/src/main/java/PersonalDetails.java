
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameL = "";
        int size = 0;
        int age = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            count++;

            String[] inputArr = input.split(",");

            age += Integer.valueOf(inputArr[1]);

            if (inputArr[0].length() > size) {
                nameL = inputArr[0];
                size = inputArr[0].length();
            }
        }

        System.out.println("Longest name: " + nameL);
        System.out.println("Average of the birth years: " + (double) age / count);

    }
}
