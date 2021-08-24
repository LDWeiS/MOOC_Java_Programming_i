
import java.util.Arrays;
import java.util.Scanner;


public class MainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        sort(numbers);
        
//        int[] numbers = {3, 2, 5, 4, 8};
//
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 1, 0);
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 0, 3);
//        System.out.println(Arrays.toString(numbers));
        
//        int[] numbers = {-1, 6, 9, 8, 12};
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
        
        // write your test code here
//        int[] array = {3, 1, 5, 99, 3, 12};
//        
//        System.out.println("Smallest: " + smallest(array));
//        System.out.println("Index of the smallest: " + indexOfSmallest(array));

    }
    
    public static int smallest(int[] array){
        int small = array[0];
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
            }
        }
        
        return small;
    }
    
    public static int indexOfSmallest(int[] array){
        int small = smallest(array);
        int index = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == small) {
                index = i;
                break;
            }
        }
        
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int small = table[startIndex];
        int index = startIndex;
        
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < small) {
                small = table[i];
                index = i;
            }
        }
        
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
        
    }
    
    public static void sort(int[] array) {
        int index;
        int i = 0;
        System.out.println(Arrays.toString(array));
        
        while (i < array.length) {
            index = indexOfSmallestFrom(array, i);
            swap(array, index, i);
            System.out.println(Arrays.toString(array));
            i++;
        }
    }
}
