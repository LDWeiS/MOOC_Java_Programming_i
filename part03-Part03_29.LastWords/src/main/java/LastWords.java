
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String text = scanner.nextLine();
            
            if (text.equals("")){
                break;
            }
            
            printLast(text);
        }
    }
    
    public static void printLast(String text){
        String[] tArray = text.split(" ");
        
        int size = tArray.length - 1;
        
        System.out.println(tArray[size]);  
    }
}
