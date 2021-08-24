
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String text = scanner.nextLine();
            printAv(text);
            
            if (text.equals("")){
                break;
            }
        }
    }
    
    public static void printAv (String text){
        String[] tArray = text.split(" ");
        for (String word: tArray){
            if (word.contains("av")){
                System.out.println(word);
            }
        }
    }
}
