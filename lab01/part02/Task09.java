import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Please enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("Please enter the value of c: ");
        int c = sc.nextInt();
        QuadEqn q = new QuadEqn(a, b , c);
        System.out.println(q);
        System.out.println(q.calculateFirstRoot());
    }
}
class QuadEqn {
    private int a;
    private int b;
    private int c;
    public QuadEqn(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public String toString() {
        return a + "x^2 + " + b + "x + " + c;
    }
    public double calculateFirstRoot() {
        return ( -b + Math.sqrt( b * b - 4 * a * c ))/ 2.0 * a;
    }
}