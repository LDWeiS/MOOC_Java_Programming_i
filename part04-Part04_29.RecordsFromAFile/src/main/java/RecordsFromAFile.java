
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        String fName = scanner.nextLine();
        
        try (Scanner fScan = new Scanner(Paths.get(fName))) {
            while (fScan.hasNextLine()) {
                String rowData = fScan.nextLine();
                String[] dataSplit = rowData.split(",");
                
                System.out.println(dataSplit[0] + ", age: " + Integer.valueOf(dataSplit[1]) + " years");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
