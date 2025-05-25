//swapping the arrays value using function
package Array_and_ArrayList;

import java.util.Arrays;

public class Swapping2 {
    public static void main(String[] args) {
        int[] arr = {23,45,33,66,83,985,309};
        swap(arr, 0,1);
        System.out.println(Arrays.toString(arr));
      
    }
    static void swap(int[] arr , int index1, int index2){

           int temp = arr[index1];
           arr[index1]=arr[index2];
           arr[index2]=temp;

    }
}
