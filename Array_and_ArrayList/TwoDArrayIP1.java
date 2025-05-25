/* it is examole for taking simple arrray input like 3 by 3 or 2 by 3
like        {3,4,5},
        a = {5,6,7},
            {7,4,3}

*/
package Array_and_ArrayList;

import java.util.Scanner;

public class TwoDArrayIP1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array[][] = new int[3][3];
        System.out.println("enter the element of arrary");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = in.nextInt();

            }
        }
        System.out.println("the matrix is as folllows");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("," + array[i][j]);

            }
        }
        in.close();
    }
}
