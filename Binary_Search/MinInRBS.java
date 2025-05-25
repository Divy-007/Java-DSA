//find the min in roated sorted array which also cointain duplicate value
public class MinInRBS {
    public static void main(String[] args) {
        int[]  nums={4,5,6};
      int target = 1;
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
                if(nums[mid]==nums[beg]  && nums[mid]==nums[end]){
                    if(nums[beg]>nums[beg+1]){
                        return beg;
                    }
                    beg++;
                    if (nums[end]<nums[end-1]){
                        return end;
                    }
                    end--;
                }
                else if(nums[beg]<nums[mid] || nums[beg]==nums[mid] && nums[mid]>nums[end]){
                    beg=mid+1;
                }
                else{
                    end=mid-1;
                }
              }
              return -1;
          }
          
             public static int search(int [] nums , int pivot,int target) {
           if (pivot==-1){
             return nums[0];
          }
          else{
            return nums[pivot+1];
          }
  
           
         
      }
      

 
 
}