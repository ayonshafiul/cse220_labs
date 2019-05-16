import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(before(1,2,1,2));
    }

    public static boolean before ( int fMonth, int fDay, int sMonth, int sDay) {
        if ( fMonth < sMonth ) {
            return true;
        } else if ( fMonth == sMonth ) {
            if ( fDay < sDay ) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}