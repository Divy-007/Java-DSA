package Binary_Search;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {9,17,53,64,92,111,321,552,999,8989,7887878};
            //arr = {0, 1,2, 3 , 4, 5 , 6 , 7 , 8,   9 ,   10  }
    int target =90;
    System.out.println(search(arr, target));

    }

    static int search(int arr[], int target){
        int beg=0;
    
        int end = (arr.length-1);
         int mid=0;
        while(beg<=end){
            mid = (beg+end)/2;
            if(target==arr[mid]){
                return arr[mid];
            }
            else if(target<=arr[mid]){
            end=mid-1;
        
            }
             else  {
                   beg=mid+1;
        
            }
            
           }
           return arr[end];
        }
    }


