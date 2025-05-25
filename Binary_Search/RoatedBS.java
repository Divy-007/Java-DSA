package Binary_Search;

public class RoatedBS {
    public static void main(String[] args) {
        int[]  nums={1,2,3,4,5,6};
      int target = 4;
      int pivot = findpivot(nums, target);
       int ans = search(nums, pivot, target);
              System.out.println(ans);
         }
             public static int findpivot(int nums[], int target){
              int beg =0;
              int end=nums.length-1;
              int mid=0;
              while(beg<=mid){
                mid=(beg+end)/2;
                if (nums[mid]>nums[mid+1]){
                  return mid;
                }
                else  if (nums[mid]<nums[mid-1]){
                 return mid-1;
                }
                else if (nums[beg]>nums[mid]){
                 end=mid-1;
                }
                else{
                 beg=mid+1;
                }
              }
              return -1;
          }
          
             public static int search(int [] nums , int pivot,int target) {
           if (pivot==-1){
             return binary_search(nums, target, 0, nums.length-1);
          }
  
           
          if (nums[pivot]==target){
              return binary_search(nums, target, 0, nums.length-1);}
          else if(target<nums[0]){
              return binary_search(nums, target,  pivot+1 , nums.length-1);
  
          }
          else{
              return binary_search(nums, target,0 , pivot-1);
  
          }
      }
      public static int binary_search(int [] nums, int target , int beg , int end ){
      while(beg<=end){
          int mid= beg + (end-beg)/2;
          if (target==nums[mid]){
              return mid;
          }
          else if (target>nums[mid]){
              beg=mid+1;
          }
          else {
              end=mid-1;
          }
      }
      return -1;
   }

 
 
}