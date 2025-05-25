/*  this  is a programm to seacrh a character in any string you want it return 
     the true if the char is presnet in string otherwise return false
*/
package Linear_Search;

import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      System.out.println("print a name");
        String name = in.nextLine();
        char target = in.nextLine().charAt(0);
        System.out.println(search(name, target));
        search2(name,target);
        in.close();
    }
    static boolean search(String str , char target ){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i)){
                return true;
            }
        }
            return false;
    }
    static void search2(String str , char target ){
        if(str.length()==0){
            System.out.println("array is void");
        }
        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i)){
                System.out.println("the search is succesfull the element is present at index "+i);
            }
        }
        
    }
}
