public class Sorting {
     public static void main(String[] args) {
        int [] arr = {2,3,4,1,5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                     arr[j-1]=arr[j];
                     arr[j]=temp;
                }
            }
                }
                for (int k = 0; k < arr.length; k++) {
                    System.out.println(arr[k]);
                    
                }
            }
        }
     