package MathForDSA;

public class resetith {
    public static void main(String[] args) {
        int no =7;
        int i =2;
        System.out.println(reset(no ,i));
    }
    static int reset(int no, int i ){
       int ans= no>>i & ~(1 );
        return ans;
    }
}
