import java.util.Scanner;
public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Please enter 10 numbers");
        for ( int i = 0; i < arr.length; i++ )  {
          arr[i] = sc.nextInt();
        }
        System.out.println("Please enter a digit between 0 and 9");
        int digit = sc.nextInt();
        for ( int i = 0; i < arr[digit]; i++) {
          System.out.print("*");
        }
        System.out.println();
    }
}
