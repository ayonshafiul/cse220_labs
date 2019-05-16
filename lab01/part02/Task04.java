import java.util.Scanner;
import java.util.InputMismatchException;
public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x,n=sc.nextInt();
            int a[]=new int[n];
            a[5]=99;
            x=n/0;
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        } catch ( ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
        finally {
            System.out.println("THE END");
        }
        
    }
}