import java.util.*;
public class decimal{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Decimal Number : ");
        int b = a.nextInt();
        String c = Integer.toBinaryString(b);
        System.out.println("Binary number is :  "+c);
        a.close();
    }
}