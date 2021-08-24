
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {       

        Container container1 = new Container();
        Container container2 = new Container();
        Scanner scanner = new Scanner(System.in);
        
        UserInterface in = new UserInterface(container1, container2, scanner); 
        in.start();
        
    }

}
