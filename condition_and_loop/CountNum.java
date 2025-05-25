package condition_and_loop;

import java.util.Scanner;

public class CountNum {
    
    public static void main(String[] args) {
               Scanner in = new Scanner(System.in);
               System.out.println("print thr number");  
               int n =in.nextInt();
               System.out.println("the no which you want to count");
               int no = in.nextInt();
               int count=0;
               while(0<n){
               int  rem=n%10;
               n=n/10;
               if (rem==no){
                count++;
               }
               }
               System.out.println(count);
            //    
            //    System.out.println("type a char whic you wnats to no of repetartion");
            //    char c = in.next().charAt(0);
            //   System.out.println(ch);
            //   if
            in.close();


    }
}
