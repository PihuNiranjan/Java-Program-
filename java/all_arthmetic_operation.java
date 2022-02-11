import java.util.*;
public class all_arthmetic_operation {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter first number : ");
        int num1 = in.nextInt();
        System.out.println("Enter second number : ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int multi = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;

        System.out.println("Sum :"+sum);
        System.out.println("Difference :"+diff);
        System.out.println("Multiply : "+multi);
        System.out.println("Division  : "+div);
        System.out.println("Modulus : "+mod);
        in.close();
    } 
        
    
}