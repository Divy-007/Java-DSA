/*
 * var-Args - when you make a method that take no of argument in it is known as var-args
 */
package Methods;

public class VarArgs {
    public static void main(String[] args) {
        method(99);
        
    }
   static void method(int...a){ // 'int ...a' it is known as varargs 
    System.out.println(a);

}
    
}
