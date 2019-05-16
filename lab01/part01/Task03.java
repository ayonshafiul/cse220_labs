import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Please enter 5 numbers: ");
        for ( int i = 0; i < arr.length; i++ ) {
            arr[i] = sc.nextInt();
        }
        for( int i = 0; i < arr.length; i++ ) {
            for ( int j = 1; j < arr.length - i ; j++ ) {
                if ( arr[j] > arr[j-1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        for ( int a: arr) {
            System.out.print(a + " ");
        }
        for ( int a: arr) {
            if ( a % 2 == 0 ) {
                System.out.print(a + " ");
            }
        }
        System.out.println();
    }
}
