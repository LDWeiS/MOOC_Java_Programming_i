
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String text = scanner.nextLine();
            splitText(text);
            
            if (text.equals("")){
                break;
            }
        }
        

    }
    
    public static void splitText(String text){
        String[] textArray = text.split("\\s");
        
        for (int i = 0; i < textArray.length; i++){
            System.out.println(textArray[i]);
        }
    }
}
