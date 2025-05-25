// taking input from user to print a array
package Array_and_ArrayList;
import java.util.Scanner;


public class ArrayIP2 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int[] array = new int[6];
        System.out.println("Enter the elements");
        for(int i=0;i<array.length; i++){
           array[i] = in.nextInt(); 
        }
        System.out.println("printing the element ");
        for(int i=0;i<array.length; i++){
            System.out.println(array[i]); 
         }
     in.close();
    }
}
