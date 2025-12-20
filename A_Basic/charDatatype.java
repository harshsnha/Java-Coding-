package A_Basic;
import java.util.Scanner;

public class charDatatype {
    public static void main(String[] args) {
        // a b c d....z, A B C D .....Z, 0 1 2 3 ...9, ! 2 #....
        char x = 'H';
        System.out.println(x);

        //ASCII value
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0);
        System.out.println((int)ch);
    }
}
