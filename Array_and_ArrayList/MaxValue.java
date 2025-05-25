package Array_and_ArrayList;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {999923,55,9883,3897,398,2398};
          System.out.println(max(arr));
    }    
    static int max(int[] arr){
        int max = arr[0];
        for (int index = 0; index < arr.length; index++) {
            if (max<=arr[index]) {
                max=arr[index];
            }
        
        }
        return max;

    }
}
