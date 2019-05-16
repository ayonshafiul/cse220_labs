import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();
        System.out.println(allDigitsOdd(number));
    }
    
    public static boolean allDigitsOdd(int number) {
        boolean odd = true;
        if ( number == 0 ) {
            return false;
        }
        while ( number != 0 ) {
            int digit = number % 10;
            if ( digit % 2 == 0 ) {
                odd = false;
            }
            number /= 10;
        }
        return odd;
    }
}