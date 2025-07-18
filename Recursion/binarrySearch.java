public class binarrySearch {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,8,88,99,103};
        int target=99;
        int s=0;
        int e=arr.length-1;
        System.out.println(search(target, arr , s,e));

    }
    static int search(int target,int[] arr , int s ,int e ){
        if(s>e){
            return -1;
        }
       int mid= s+(e-s)/2;

       if(arr[mid]==target){
        return mid;
       }
       if(target<arr[mid]){
        return search(target, arr, s, mid-1);
       }
       return search(target, arr,  mid+1,e);
    }
}
