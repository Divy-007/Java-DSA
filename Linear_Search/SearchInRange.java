/*  this  is a programm to seacrh a character in any string you want it return 
     the true if the char is presnet in string otherwise return false
*/
package Linear_Search;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      System.out.println("print a name");
        String name = in.nextLine();
        System.out.println("print a charcter");
        char target = in.nextLine().charAt(0);

       System.out.println("print the starting  range ");
        int r1 = in.nextInt();
        System.out.println("print the ending range ");

        int r2 = in.nextInt();


        
        System.out.println(search(name, target , r1 , r2));
    
        in.close();
    }
    static boolean search(String str , char target , int r1 , int r2 ){
        if(str.length()==0){
            return false;
        }
        for (int i = r1; i <=r2; i++) {
            if(target==str.charAt(i)){
                return true;
            }
        }
            return false;
    }
    
}
