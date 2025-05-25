package condition_and_loop;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("print the no which you want to reverse");
        int n=in.nextInt();
        int r=0;
        while(0<n){
            int rem =n%10;
            n=n/10;
             r = r *10+rem;
        }
        System.out.println("reverse no="+r);
      in.close();
    }
}
