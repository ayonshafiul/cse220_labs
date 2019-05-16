import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a month: ");
        int month = sc.nextInt();
        System.out.println("Please enter a day: ");
        int day = sc.nextInt();
        System.out.println(season(month, day));
    }

    public static String season(int month, int day) {
        if ( month >= 1 && month <=2 ) {
            return "Winter";
        } else if ( month == 3 ) {
            if ( day <= 15 ) 
                return "Winter";
            else 
                return "Spring";
        } else if ( month >= 4 && month <= 5 ) {
            return "Spring";
        } else if ( month == 6 ) {
            if ( day <= 15 ) 
                return "Spring";
            else 
                return "Summer";
        } else if ( month >= 7 && month <= 8 ) {
            return "Summer";
        } else if ( month == 9 ) {
            if ( day <= 15 ) 
                return "Summer";
            else 
                return "Fall";
        } else if ( month >= 10 && month <= 11 ) {
            return "Fall";
        } else { // month == 12 
            if ( day <= 15 ) 
                return "Fall";
            else 
                return "Winter";  
        }
    }
}