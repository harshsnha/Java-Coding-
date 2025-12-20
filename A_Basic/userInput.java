package A_Basic;
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        int a = sc.nextInt();
        System.out.print("Enter the number b : ");
        int b = sc.nextInt();
        System.out.println(a+b);
//        System.out.println("Area of Square : " +n*n);
    }
}
