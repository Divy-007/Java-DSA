public class fact {
    public static void main(String[] args) {
    
        System.out.println(facts(5));
    }
    static int facts(int n){
        if(n == 0){
            return 1 ;
        }
      return n*facts(n-1);
        
    }
}
