import java.util.Scanner;

public class Fibonacchi {

    public static void printFibo(int n){
        int a = 0;
        int b = 1;

        System.out.println("print upto "+n +" terms" );
        for(int i = 1; i<=n; i++){
            System.out.print(a +" ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFibo(n);
        sc.close();
    }
}