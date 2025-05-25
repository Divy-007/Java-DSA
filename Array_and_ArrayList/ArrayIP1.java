/*
 * printing a simple array by using for loop
 */
package Array_and_ArrayList;


public class ArrayIP1 {
      public static void main(String[] args) {
        
        String[] names  = new String[7];
          names[0] = "Devu";
          names[1] = "Morris";
          names[2] = "Kevin";
          names[3] = "Sagar";
          names[4] = "Smith";
          names[5] = "Ros";
          names[6] = "Peter";
          
          for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
            
          }

      }
}
