import java.util.Scanner;
public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyReader r = new MyReader();
        System.out.println("Please enter a number: ");
        String s = sc.nextLine();
        try {
            System.out.println(r.readInteger(s));
        } catch (EitaIntegerNoiException e) {
            System.out.println("Only Integers are allowed.");
        }
    }
}
class MyReader {
    int readInteger(String s){
        if (s.contains(".")) {
            throw new EitaIntegerNoiException();
        } else {
            return Integer.valueOf(s);
        }
    }
}

class EitaIntegerNoiException extends RuntimeException {

}
