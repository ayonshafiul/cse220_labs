import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x,n=sc.nextInt();
            int a[]=new int[n];
            a[5]=99;
            x=n/0;
        } catch (ArithmeticException e) {
            System.out.println("can't divide by zero");
        } catch ( ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid array index");
        } finally {
            System.out.println("THE END");
        }
        
    }
}