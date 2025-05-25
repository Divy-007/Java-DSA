package condition_and_loop;
import java.util.Scanner;

public class CaseCheck {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        System.out.println(ch);
      // String word="Hello";
      // System.out.println(word.charAt(3));
      if(ch<=90 && ch>=65  ){
        System.out.println("charcater is in capital letter");
      }
      else{
        System.out.println("character is in small");
      }
      in.close();

    }
}