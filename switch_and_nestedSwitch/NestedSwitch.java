package switch_and_nestedSwitch;
import java.util.Scanner;
public class NestedSwitch {
   public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    int StdId =in.nextInt();
    String branch=in.next();
    switch (StdId){
        case 111:{
            System.out.println("111");
            break;

        }
        case 222:{
            System.out.println("222");
            break;

        }
         case 333:{
            System.out.println("DEVU");
            switch (branch){
                case "CSE":{
                    System.out.println("from CSE branch");
                    break;

                }
                case "civil":{
                    System.out.println("from civil branch");
                    break;

                }
            
         }
    }
    in.close();
   }
     
}
}
