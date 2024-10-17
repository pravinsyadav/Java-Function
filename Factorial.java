import java.util.*;
public class Factorial {
    public static void calculateFactorial(int n){
        if(n<0){
            System.out.println("invalid");
            return;
        }
        int Factorial = 1;
        for(int i = n; i>=1; i--){
            Factorial = Factorial * i;
        }
        System.out.println(Factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("the factorial is: ");
        calculateFactorial(n);
    }
}
