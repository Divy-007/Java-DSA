package Linear_Search;

public class MinNum {
    public static void main(String[] args) {
        int arr[] = {38,87,837,87,7,37};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
         int min = arr[0];
         for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
               min=arr[i];
            }
         }
                 return min;

    }
}
