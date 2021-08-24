
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> pointsList = new ArrayList<>();
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) { 
            int pointsIn = Integer.valueOf(scanner.nextLine());
            
            if (pointsIn == -1) {
                break;
            } else if (pointsIn > 100 || pointsIn < 0) {
                ;
            } else {
                pointsList.add(pointsIn);
            }
        }
        
        averagePoints(pointsList);
        passingAverage(pointsList);
        gradeDist(pointsList);

    }
    
    public static void averagePoints(ArrayList<Integer> pointsList) {
        int pointsTotal = 0;
        
        for (int points: pointsList) {
            pointsTotal += points;
        }
        
        System.out.println("Point average (all): " + (double)pointsTotal/pointsList.size()); 
    }
    
    public static void passingAverage(ArrayList<Integer> pointsList) {
        int pointsTotal = 0;
        int pass = 0;
        
        for (int points: pointsList) {
            if (points >= 50) {
                 pointsTotal += points;
                 pass++;
            }
        }
        
        if (pass == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + (double)pointsTotal/pass); 
        }
        
        System.out.println("Pass percentage: " + (double)pass/pointsList.size()*100);
        
    }
    
    public static void gradeDist(ArrayList<Integer> pointsList){
        int grade5 = 0;
        int grade4 = 0;
        int grade3 = 0;
        int grade2 = 0;
        int grade1 = 0;
        int grade0 = 0;
        
        for (int points: pointsList) {
            if (points < 50) {
                 grade0 ++;
            } else if (points < 60) {
                grade1 ++;
            } else if (points < 70) {
                grade2 ++;
            } else if (points < 80) {
                grade3 ++;
            } else if (points < 90) {
                grade4 ++;
            } else {
                grade5 ++;
            }
        }
        
        System.out.println("Grade distribution:");
        System.out.print("5: ");
        printStar(grade5);
        System.out.print("4: ");
        printStar(grade4);
        System.out.print("3: ");
        printStar(grade3);
        System.out.print("2: ");
        printStar(grade2);
        System.out.print("1: ");
        printStar(grade1);
        System.out.print("0: ");
        printStar(grade0);

        
    }
    
    public static void printStar(int grade) {
        for (int i = 0; i < grade; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
}
