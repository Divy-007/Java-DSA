package Binary_Search;

import java.util.Arrays;

class FirststAndLastPosition {
    public static void main(String[] args){
        int[] nums={5,7,7,8,8,10};
        int target=11;
        System.out.println(Arrays.toString(searchRange(nums, target)));
        
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
       int start=search(nums,target,true);
       int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
        
    }
    static int search(int[] nums, int target, boolean findstartindex){
         int beg=0;
         int ans =-1;
         int end=nums.length-1;
        while(end>=beg){
           int mid=(beg+end)/2;
            if(target==nums[mid]){
               ans=mid;
               if(findstartindex){
                end=mid-1; }
               else{
                beg=mid+1;}
                }
            else if(target>nums[mid]){
                beg=mid+1;}
            else{end=mid-1; }
        }   
        return ans;
    }
}