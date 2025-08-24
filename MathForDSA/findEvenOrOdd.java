package MathForDSA;

public class findEvenOrOdd {
    
public static void main(String[] args) {
    int no=1010111; // Example binary number
    System.out.println(find( no));
    
}
    static String find(int no){
    if((no & 1) == 0){
        return "even";  
    } else {
        return "odd";   
    }
}
}
