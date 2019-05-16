import java.util.Scanner;
public class Task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[10];
        System.out.println("Please enter 10 numbers: ");
        for ( int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }
        squareArray(input, 10);
        printArray(input, 10);
    }
    public static void printArray(int[] array, int size) {
        for ( int i = 0; i < size; i++ ) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void squareArray(int[] array, int size) {
        for ( int i = 0; i < size; i++ ) {
            array[i] *= array[i];
        }
    }
}