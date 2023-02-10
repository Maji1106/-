import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextFloat();
        double b = scan.nextFloat();
        double result = (a - b) * (a + b);
        System.out.println("A =?" + a);
        System.out.println("B =?" + b);
        System.out.println("(" + a + " - " + b + ")" + "(" + a + " + " + b + ")" + " = " + result);
    }
}