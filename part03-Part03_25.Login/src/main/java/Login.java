
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] username = {"alex", "emma"};
        String[] password = {"sunshine", "haskell"};

        System.out.print("Enter username: ");
        String uname = scanner.nextLine();

        System.out.print("Enter password: ");
        String pword = scanner.nextLine();

        checkUp(username, password, uname, pword);

    }

    public static void checkUp(String[] username, String[] password, String uname, String pword) {
        Boolean found = false;
        
        for (int i = 0; i < username.length; i++) {
            if (uname.equals(username[i]) && pword.equals(password[i])) {
                System.out.println("You have successfully logged in!");
                found = true;
                }
            } 
        
        if (!found){
            System.out.println("Incorrect username or password!");
        }
    }
}
