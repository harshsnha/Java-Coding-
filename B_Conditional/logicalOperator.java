package B_Conditional;

import java.util.Scanner;

public class logicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>99 && n<1000) System.out.println("3 Digit Number"); // && = And operator
        else System.out.println("Not a 3 Digit Number");
        // T && T = T
        // T && F = F
        // F && T = F
        // F && F = F
    }
}
