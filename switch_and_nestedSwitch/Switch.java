package switch_and_nestedSwitch;
import java.util.Scanner;


public class Switch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
    String fruit = in.next();
    switch(fruit){
        case "Mango":
              System.out.println("king of fruit");
              break;
         case "Apple":
            System.out.println("red and sweet");     
            break;
          case "banana":
             System.out.println("yellow ");
             break;
          default :
            System.out.println("enter the valid fruit");
    } 
    in.close();
    }
    
}
