
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.print("Search for? ");
        String searchName = scanner.nextLine();

        searchName(list, searchName);

    }

    public static void searchName(ArrayList<String> list, String searchName) {
        if(list.contains(searchName)){
            System.out.println(searchName + " was found!");
        } else {
            System.out.println(searchName + " was not found!");
        }
//        for (String name : list) {
//            if (name.equals(searchName)) {
//                System.out.println(name + " was found!");
//                return;
//            }
//        
//        } 
//        System.out.println(searchName + " was not found!");
    }
}
