import java.lang.Math;
public class reverse {
    public static void main(String[] args) {
        System.out.println(rev1(1284));
        rev2(1284);
        System.out.println(sum);
        System.out.println(rev3(1284));
    }
    // way 1
    static String  rev1(int n){
        if(n==0){
            return"";
        }
        
        return (n%10)+rev1(n/10);

    }
    //way 2
    static int sum =0;
    static void rev2(int n ){
        if(n==0){
            return;
        }
        int rem =n%10;
         sum=sum*10+rem;
        rev2(n/10);
    }
    //way 3
    static int rev3 (int n){
        int digits =(int) (Math.log10(n))+1;
        return helper(n,digits);
    }
    private static int helper (int n ,int digits){
        if (n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }


}
