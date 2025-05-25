// swaapping the array value by simpe temp method
package Array_and_ArrayList;
public class Swapping1 {
    public static void main(String[] args) {
        int[] arr ={ 1,92,62,24,36,53,53};
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
    
}
