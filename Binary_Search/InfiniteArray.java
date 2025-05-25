package Binary_Search;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr ={3,5,7,9,11,34,56,68,99,123,244,343,445,521,754,883,891,923,918,953,999,};
        int target=7;
        System.out.println(ans(arr, target));
        
    }
    
public static int ans(int[] arr , int target){
    int beg=0;
    int end=1;
    while (target>arr[end]) {
       int newbeg=end+1;
        end=end+(end-beg+1)*2; 
        beg=newbeg;
    }
    return search(arr, target, beg, end);
}
    public static int search(int [] arr , int target, int beg , int end){
        while(beg<=end){
            int mid = beg + (end - beg) / 2;
          if(target==arr[mid]){
                return mid;
            }
            else if(target<=arr[mid]){
            end=mid-1;
            }
             else  {
               beg=mid+1;
        
            }
            
           }
           return -1;
        }
    }
