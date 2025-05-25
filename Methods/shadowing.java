/*
 * Shadowing - shadowing is like hiding the static variable on the local variable 
 */

package Methods;

public class shadowing {
    static int a=111;
    public static void main(String[] args) {
        System.out.println(a);//------>o/p=111
        int a = 19;
        System.out.println(a);// here shadowing occurs which hiding the static variable and using the local variable a ---->o/p=19
        method();// it will use the static variable because it is out of the main method -----o/p=111
    }
   static void method(){
        System.out.println(a);
    }
}
