
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String iD = scanner.nextLine();
            if (iD.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Product item = new Product(iD, name);
            boolean repeat = false;

            for (int i = 0; i < products.size(); i++) {
                if (item.equals(products.get(i))) {
                    repeat = true;
                }
            }

            if (repeat == false) {
                products.add(item);
            }

        }

        System.out.println("==Items==");

        for (Product item : products) {
            System.out.println(item);
        }

    }
}
