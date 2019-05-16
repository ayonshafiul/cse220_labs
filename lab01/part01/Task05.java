import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 15 digits: ");
        int arr[] = new int[15];
        int counter[] = new int[10];
        for ( int i = 0; i < arr.length; i++ ) {
            int number = sc.nextInt();
            if ( number > 9 || number < 0 ) {
                i--;
                System.out.println("The number must be between 0 and 9");
                continue;
            }
            counter[number]++;
        }

        for ( int i = 0; i < counter.length; i++ ) {
            System.out.println(i + " was found " + counter[i] + " time(s).");
        }
    }
}
