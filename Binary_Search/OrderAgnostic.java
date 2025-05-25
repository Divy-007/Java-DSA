package Binary_Search;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {300,222,100,99,44,32,29,13,9,4,3,1};
        int target = 99;
        System.out.println(OrderAgonsticBS(arr , target));
    }
    static boolean OrderAgonsticBS(int[] arr ,int target){
        int beg = 0;
        int end = arr.length-1;
        if(arr[beg]<arr[end]){
            while (beg<=end) {
                int mid = (beg+end)/2;
                if(target==arr[mid]){
                    return true;
                  }
                  else if (target<arr[mid]){
                           end=mid-1;
                  }
                  else{
                       beg=mid+1;
                  }
            }
        }
          else{
            while (beg<=end) {
                int mid = (beg+end)/2;
                if(target==arr[mid]){
                    return true;
                  }
                  else if (target<arr[mid]){
                    beg=mid+1;
                  }
                  else{
                    end=mid-1;
                       
                  }
            }
          }
        return false;
    }
    // static boolean increasingorder(int[] arr ,int target){
        
    // }
}
