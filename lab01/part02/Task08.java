public class Task08 {
    public static void main(String[] args) {
        Date d = new Date(16,5,2019);
        System.out.println(d);
    }
}

class Date {
    int day;
    int month;
    int year;
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay() {
        return this.day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return this.month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }
}