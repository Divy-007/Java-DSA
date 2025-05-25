// import java.util.Scanner;
// class First{
//     public static void main(String[] args){
//      Scanner input = new Scanner(System.in);
//      String name = input.next();
//      System.out.println(name);
//     } 
//  }
import java.util.Scanner;

class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Initializing Scanner for user input
        
        System.out.print("Enter your name: "); // Prompting user for input
        String name = input.next(); // Reads a single word (for full line, use input.nextLine())
        
        System.out.println("Hello, " + name); // Prints the user's input with a message
        input.close(); // Closing the Scanner to prevent resource leak
    }
}
