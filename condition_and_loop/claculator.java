package condition_and_loop;

import java.util.Scanner;

public class claculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(true){
            char op= in.next().trim().charAt(0);
            if(op== '+'|| op== '-' || op== '*' || op== '/' || op=='%'){
                int a=in.nextInt();
                int b=in.nextInt();
                if(op=='+'){
                    int c=a+b;
                    System.out.println("the addition of two no="+c);
                }
                if(op=='-'){
                    int c=a-b;
                    System.out.println("the addition of two no="+c);
                }
                if(op=='*'){
                    int c=a*b;
                    System.out.println("the addition of two no="+c);
                }
                if(op=='/'){
                    int c=a/b;
                    System.out.println("the addition of two no="+c);
                }
                if(op=='%'){
                    int c=a%b;
                    System.out.println("the addition of two no="+c);
                }


            }
            in.close();


        }
    }
    
}
