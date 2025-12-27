package B_Conditional;
import java.util.Scanner;

public class triangleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st side  : ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd side  : ");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd side : ");
        int c = sc.nextInt();

        if ((a+b)>c && (b+c)>a && (c+a)>b) System.out.println("Valid Triangle");
        else System.out.println("Invalid triangle");
    }
}
