class starting{
    public static void main(String[] args){
        message();
       }
    static void message(){
        System.out.println("heloo messge");
        for (int i = 0; i < 5; i++) {
            message();
        }
    }
}