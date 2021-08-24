
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            } else {
                System.out.print("Pages: ");
                int pages = Integer.valueOf(scanner.nextLine());
                System.out.print("Publication year: ");
                int year = Integer.valueOf(scanner.nextLine());

                library.add(new Book(title, pages, year));
            }
        }

        System.out.print("What information will be printed? ");
        String info = scanner.nextLine();

        displayInfo(library, info);
        // implement here the program that allows the user to enter 
        // book information and to examine them

    }

    public static void displayInfo(ArrayList<Book> library, String info) {
        if (info.equals("everything")) {
            for (Book books : library) {
                System.out.println(books);
            }
        } else if (info.equals("name")) {
            for (Book books : library) {
                System.out.println(books.getName());
            }
        }
    }
}
