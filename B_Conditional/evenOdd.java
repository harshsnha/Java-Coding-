package B_Conditional;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        //If - Conditional
        if(n%2 == 0) {
            System.out.println("Even");
        }
        if (n%2 == 1){
            System.out.println("Odd");
        }

        //If Else - Conditional
        if(n%2 == 0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
