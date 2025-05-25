package Binary_Search;
public class Split_Array_Sum {
    public static void main(String[] args) {
        int [] nums = {7,2,8,10,9,3};
        int  m=2;
        System.out.println(SplitArray(nums,m));
    }
    public static int SplitArray(int[] nums , int m){
        int start = 0;
        int end=0;
        for (int i = 0; i < nums.length; i++) {
            start=Math.max(start, nums[i]);//find the stat valu for our range 
            end +=nums[i];// find the end value 
        }
        //bunary search
        while(start<end){
            int mid = start + (end-start)/2;
            //calculating how many peices u can add means spilt the array when the sum exceed than mid
            int sum =0;
            int peices =1;
            for (int i = 0; i < nums.length; i++) {
                if(sum+nums[i]>mid){// is sum exceed create spliting the array
                    sum=nums[i];
                    peices++;

                }
                else{//if not exceed then exapnd the sum 
                    sum+=nums[i];
                }
            }
            if (peices>m){
                start=mid+1;
            }
             else{
                end=mid;
             }

        }
         return end;//return start or end because at the and start will equal to end

    }






}
