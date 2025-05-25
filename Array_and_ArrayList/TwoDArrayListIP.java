package Array_and_ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class TwoDArrayListIP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> al  = new ArrayList<>();
        //we can not get value from empty list so we have to intialize it 
        for (int index = 0; index < 7; index++) {
              al.add(new ArrayList<>());}
              

        for (int index = 0; index <7; index++) {
            al.get(index).add(in.nextInt());
            
        }
        System.out.println("printing the element");
        for (int index = 0; index<7; index++) {
            System.out.println(al.get(index));
            
        }
        in.close();
    }
}
