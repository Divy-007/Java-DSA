package Binary_Search;

public class PeakIndexInMountainArray {
  public static void main(String[] args) {
      int[] arr= {0,11,23,24,36,30,24,19, 6, 0};
      //    arr ={0, 1, 2, 3, 4, 5, 6 ,7, 8, 9 }
      System.out.println(peakIndexInMountainArra(arr));

  }
  public static int peakIndexInMountainArra(int[] arr) {
      int beg=0;
      int mid=0;
      int end=arr.length-1;
      while(beg<end){
            mid=(beg+end)/2;
            if(arr[mid]>arr[mid+1]){
              end=mid;
            }
            else {
               beg=mid+1;
            }
            
      }
      return end;

      
  }
}
