public class palindrome {
    public static void main(String[] args) {
       int n=1221;
        rev(n);
        if(n==sum){
            System.out.println(n+ " is a palindrome no ");
        }
        else{
            System.out.println(n+ " is not  a palindrome no ");
        }
    }
    static int sum =0;
    static void rev(int n ){
        if(n==0){
            return;
        }
        int rem =n%10;
        sum=sum*10+rem;
        rev(n/10);
    }
}
