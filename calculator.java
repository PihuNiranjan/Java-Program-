import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // we make calculator by using switch case

        System.out.println("Choose your Operation :-");
        System.out.println(
                "  Enter 1 for Addition\n  Enter 2 for Subtraction\n  Enter 3 for Multiplication\n  Enter 4 for Division");

        System.out.println("Enter your Operation :- ");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition :- ");
                System.out.println("Enter first number : ");
                float a1 = scan.nextFloat();
                System.out.println("Enter second number : ");
                float a2 = scan.nextFloat();
                System.out.println("Addition of " + a1 + " + " + a2 + " = " + (a1 + a2));
                break;

            case 2:
                System.out.println("Subtraction :- ");
                System.out.println("Enter first number : ");
                float s1 = scan.nextFloat();
                System.out.println("Enter second number : ");
                float s2 = scan.nextFloat();
                System.out.println("Subtraction of " + s1 + " - " + s2 + " = " + (s1 - s2));
                break;

            case 3:
                System.out.println("Multiplication :- ");
                System.out.println("Enter first number : ");
                float m1 = scan.nextFloat();
                System.out.println("Enter second number : ");
                float m2 = scan.nextFloat();
                System.out.println("Multiplication of " + m1 + " * " + m2 + " = " + (m1 * m2));
                break;

            case 4:
                System.out.println("Division :- ");
                System.out.println("Enter first number : ");
                float d1 = scan.nextFloat();
                System.out.println("Enter second number : ");
                float d2 = scan.nextFloat();
                System.out.println("Division of " + d1 + " / " + d2 + " = " + (d1 / d2));
                break;

            default:
                System.out.println("Wrong choice\nRenter your choice");

        }

    }

}