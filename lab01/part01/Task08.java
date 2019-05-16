import java.util.Scanner;
public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the row matrix: ");
        int width = sc.nextInt();
        int[] a = new int[width];
        int[] b = new int[width];
        int[] c = new int[width];
        System.out.println("Please enter values for matrix a:");
        for ( int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Please enter values for matrix b:");
        for ( int i = 0; i < b.length; i++ ) {
            b[i] = sc.nextInt();
             
        }
        for ( int i = 0; i < c.length; i++ ) {
            c[i] = 5 * a[i] - b[i];
            System.out.print(c[i] + " ");            
        }
        System.out.println();

    }
}