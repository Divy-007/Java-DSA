// printing a Arraynum
package Array_and_ArrayList;

import java.util.ArrayList;

public class ArrayListIP1 {
    public static void main(String[] args) {
        ArrayList <Integer> num =  new ArrayList<>();
        num.add(88);
        num.add(838);
        num.add(8893);
        num.add(30);
        num.add(38);
        num.add(3998);
        num.add(33);
        for(int i=0 ; i<5 ;i++){
            System.out.println(num.get(i));
        }



    }
}
