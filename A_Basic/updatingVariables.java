package A_Basic;
public class updatingVariables {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);
        x = 7;
        System.out.println(x); //updating the value
        x = x + 6;             // Shortcut = x +=6;
        System.out.println(x);
        x = x - 20;            // Shortcut = x -=20;
        System.out.println(x);
        x = x * -1;            // Shortcut = x *=-1;
        System.out.println(x);
        x = x + 3;
        System.out.println(x);
        x = x / 2;             // Shortcut = x /=2;
        System.out.println(x);
    }
}
