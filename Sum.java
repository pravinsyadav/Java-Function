import java.util.Scanner;

public class Sum {
    public static int printSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no 1: ");
        int a = sc.nextInt();
        System.out.println("enter no 2: ");
        int b = sc.nextInt();

        int sum = printSum(a, b);
        System.out.println("the sum is: "+ sum);
        
    }
}
