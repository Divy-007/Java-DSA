public class sumofdig {
    public static void main(String[] args) {
        System.out.println(fun(1343));
    }
static int fun(int n){
    if(n == 0){
        return 0;
    }
    int dig=n%10;
    n=n/10;
    return dig+fun(n);
}
}
