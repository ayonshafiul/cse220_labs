import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Please enter 10 numbers: ");
        for ( int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0, min = 0;
        for ( int i = 0; i < arr.length; i++) {
            if ( arr[i] > arr[max] )  {
                max = i;
            }
            if ( arr[i] < arr[min]) {
                min = i;
            }
        }
        int temp = arr[max];
        arr[max] = arr[min];
        arr[min] = temp;
        for ( int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
