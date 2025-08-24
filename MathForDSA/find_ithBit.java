package MathForDSA;

public class find_ithBit {
    public static void main(String[] args) {
        int no=8;//in binary 1000
        int i=2;
        System.out.println(find(no , i));
    }
    static int find(int no , int i ){
        int ans=(no>>i)&1;
        return ans;
    }
}
