package Binary_Search;

public class countinRBS {
    public static void main(String[] args) {
        int[] arr = { 7,2,3,4,5};
        int count =findpivot(arr, 0)+1;
        System.out.println(count);

    }
    public static int findpivot(int arr[], int target){
        int beg =0;
        int end=arr.length-1;
        int mid=0;
        while(beg<=mid){
          mid=(beg+end)/2;
          if (arr[mid]>arr[mid+1]){
            return mid;
          }
          else  if (arr[mid]<arr[mid-1]){
           return mid-1;
          }
          else if (arr[beg]>arr[mid]){
           end=mid-1;
          }
          else{
           beg=mid+1;
          }
        }
        return -1;
    }
}
