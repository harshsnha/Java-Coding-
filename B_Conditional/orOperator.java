package B_Conditional;

import java.util.Scanner;

public class orOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%5 == 0 || n%3 == 0) System.out.println("Divisible by 5 or 3 "); // || = or operator
        else System.out.println("Not Divisible by 5 or 3");
        // T || T = T
        // T || F = T
        // F || T = T
        // F || F = F
    }
}
