package Binary_Search;

public class FindInMountain {
    
    public static void main(String[] args) {
        int[] mountainArr = {1,2,3,4,5,3,1};
        int target=5;
        System.out.println(search(mountainArr,target));
        


        
    }
    public static int search(int[] mountainArr , int target){
        int peak = peakIndexInMountainArray(mountainArr );
        int firsttry= OrderAgonsticBS(mountainArr ,target , 0 , peak);
        if(firsttry != -1){
            return firsttry;
        }
        return OrderAgonsticBS(mountainArr, target,peak,mountainArr.length-1);
        
    }
    static int OrderAgonsticBS(int[] mountainArr ,int target , int beg , int end){
        
        if(mountainArr[beg]<mountainArr[end]){
            while (beg<=end) {
                int mid = (beg+end)/2;
                if(target==mountainArr[mid]){
                    return mid;
                  }
                  else if (target<mountainArr[mid]){
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
                if(target==mountainArr[mid]){
                    return mid;
                  }
                  else if (target<mountainArr[mid]){
                    beg=mid+1;
                  }
                  else{
                    end=mid-1;
                       
                  }
            }
          }
        return -1;
    }
    public static int peakIndexInMountainArray(int[] mountainArr) {
        int beg=0;
        int mid=0;
        int end=mountainArr.length-1;
        while(beg<end){
              mid=(beg+end)/2;
              if(mountainArr[mid]>mountainArr[mid+1]){
                end=mid;
              }
              else {
                 beg=mid+1;
              }
              
        }
        return end;
  
        
    }
}
