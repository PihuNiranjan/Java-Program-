// find the largest number of the three number 

import java.util.*;
public class largest_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter first number : ");
        int first = in.nextInt();
        System.out.println("enter second number : ");
        int second = in.nextInt();
        System.out.println("enter third number : ");
        int third = in.nextInt();
        if(first > second && first > third){
            System.out.format("%d is greater ",first);
        } else if(second> first && second > third){
            System.out.format("%d is greater ",second);
        }else{
            System.out.format("%d is greater ",third);
        }
        in.close();
    }
}
