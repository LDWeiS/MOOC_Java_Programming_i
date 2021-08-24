
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String text = scanner.nextLine();
            
            if (text.equals("")){
                break;
            }
            
            printFirst(text);
        }
    }
    
    public static void printFirst(String text){
        String[] tArray = text.split(" ");
        
        System.out.println(tArray[0]);
    }
}
