import java.util.*;
public class Functions {

    public static void printMyName(String name){         // creation of function
        System.out.println("your entered string is:");    
        System.out.println(name);
        return;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String name = sc.nextLine();
        printMyName(name);    // here we call the function 
        sc.close();
    }
}