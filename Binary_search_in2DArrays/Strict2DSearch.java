import java.util.Arrays;
public class Strict2DSearch {
    public static void main(String[] args) {
        int [][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        int target=12;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] binarysearch(int[][] matrix , int row , int cstart , int cend , int target){
            
            while (cstart<=cend){
                int mid = cstart + (cend-cstart)/2;
                if (matrix[row][mid]==target){
                    return new int[]{row,mid};
                }
                else if(matrix[row][mid]>target){
                    cend=mid-1;
                }
                else{
                    cstart=mid+1;
                }
            }
            return new int []{-1,-1};
    }
    public static int[] search(int[][] matrix , int target){    
        int rows = matrix.length;
        int cols= matrix[0].length;
         //if row is 1
        if (rows==1){
            return binarysearch(matrix ,  0 ,  0 , cols-1 ,  target);
        }
        //if we have multiple rows run the loop till we have 2 rows
        int rstart=0;
        int rend=rows-1;
        int cmid=cols/2;
        while (rstart<(rend-1)){
          int   rmid=rstart+(rend-rstart)/2;
            if (matrix[rmid][cmid]==target){
                return new int[]{rmid,cmid};
            }
            else if (matrix[rmid][cmid]>target){
                rend=rmid;  // reducing the sapce value of a matrix row end will point to the mid row 
            }
            else{
                rstart=rmid;  //reducing the sapce value of a matrix row start will point to the mid row 
            }
        }
        //  case 3 if we have the 2 rows 
        // firstly check the if mid value contain the target
        if (matrix[rstart][cmid]==target){
            return new int[]{rstart,cmid};
        }
        if(matrix[rstart+1][cmid]==target){
            return new int[]{rstart+1,cmid};
        }
        //in case 3 here are 4 steps
        //step 1 
        if (matrix[rstart][cmid]>target){
            return binarysearch(matrix ,  rstart ,  0 , cmid-1 ,  target);
        }
       else if (matrix[rstart][cmid]<target && target <= matrix[rstart][cols - 1]){
            return   binarysearch(matrix ,  rstart,  cmid+1 , cols-1 ,  target);
        } else if (matrix[rstart+1][cmid]>target){
            return binarysearch(matrix ,  rstart+1 ,  0 , cmid-1 ,  target);
        }
        else{
            return binarysearch(matrix ,  rstart+1 ,  cmid+1 , cols-1 ,  target);

        }
        
    }
}
