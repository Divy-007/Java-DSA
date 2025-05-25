package Binary_Search;

public class SimpleSearch {
    public static void main(String[] args) {
        int[] arr = {9,17,53,64,92,111,321,552,999};
            //arr = {0, 1,2, 3 , 4, 5 , 6 , 7 , 8}
        int target =111;
        System.out.println(search(arr, target));

        }
        static boolean search(int[] arr , int target){
            int beg = 0;
            int end = arr.length-1;
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
            return false;
        }
    }

