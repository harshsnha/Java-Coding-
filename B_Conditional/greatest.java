package B_Conditional;

import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number :  ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number :  ");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd number :  ");
        int c = sc.nextInt();
//        if (a>=b && a>=c){
//            System.out.println(a+" is greatest");
//        }
//        else if (a<=b && b>=c){
//            System.out.println(b+" is greatest");
//        }
//        else {
//            System.out.println(c+" is greatest");
//        }

        //Nested - if else
        if (a>b){
            if (a>c){
                System.out.println(a+" is greatest");

            }else // c>a>b
                System.out.println(c+ " is greatest");
        }
        else { //b>a
            if (b>c){
                System.out.println(b+ " is greatest");
            }else // c>b>a
                System.out.println(c+" is greatest");
        }
    }
}
