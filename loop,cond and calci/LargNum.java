import java.util.Scanner;

class LargNum{
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(" a is largest number");
            }
        }
        else if(b>a){
            if(b>c){
                System.out.println(" b is largest number");
            }
        }
        else {
            System.out.println(" c is largest number");






        }
    }

}