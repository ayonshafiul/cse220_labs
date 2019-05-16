import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Please enter 10 numbers: ");
        for ( int i = 0; i < arr.length; i++ ) {
            if ( i != 0 ) {
                int number = sc.nextInt();
                boolean found = false;
                for ( int j = 0; j < i; j++ ) {
                    if ( number == arr[j] ) {
                        found = true;
                        break;
                    }
                }
                if ( found ) {
                    i--;
                    System.out.println(number + " is already in the list.");
                } else {
                    arr[i] = number;
                }
            } else {
                arr[i] = sc.nextInt();
            }
        }
        for ( int a : arr) {
            System.out.print(a + " ");
        }
    }
}
