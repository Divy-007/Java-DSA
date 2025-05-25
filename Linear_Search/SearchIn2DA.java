package Linear_Search;

public class SearchIn2DA {
    
    public static void main(String[] args) {
        int arr[][] = {
            {23,34,67},
            {7,76,389,83},
            {378,389,837,378}
        };
        int target = 389;
        search(arr , target);
    }
    static void search(int arr[][] , int target ){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    System.out.println("search is success full and the element is at position" +i+j);
                }
            }
            
        }

    }
}
