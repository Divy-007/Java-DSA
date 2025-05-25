package Linear_Search;
import java.util.Scanner;

public class SimpleSearch {
    public static void main(String[] args) {
       int arr[] = {3,33,99,329,98,387,2109};
       Scanner in = new Scanner(System.in);
       int item = in.nextInt();
       for (int index = 0; index < arr.length; index++) {
            if(item==arr[index]){
              System.out.println("the element found at index "+ index );
              break;
            }
            
        
       } 
       
        System.out.println("the elemt is not prsent in the array");
        
         in.close();
    }
}
