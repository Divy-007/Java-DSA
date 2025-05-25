// taking input from user  to print a ArrayList
package Array_and_ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIP2 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         ArrayList <Integer> al = new ArrayList<>();
         System.out.println("enter the element");
         for (int index = 0; index < 8; index++) {
              al.add(in.nextInt());
            
         }
         System.out.println("printing the element ");
         for (int index = 0; index <8; index++) {
            System.out.println(al.get(index));
         }
         in.close();
    }
}
