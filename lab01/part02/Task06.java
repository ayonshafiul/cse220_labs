import java.util.Scanner;
public class Task06 {
    public static void main(String args[]) {
        double h, w, a;
        Square s1 = new Square();
        s1.setHeight(3);
        s1.setWidth(4);
        h = s1.getHeight();
        w = s1.getWidth();
        a = s1.getArea();

        System.out.println("Height = "+ h);
        System.out.println("Width = "+ w);
        System.out.println("Area = "+ a );
    }
}

class Square {
    private double height;
    private double width;
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return this.width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return this.height * this.width;
    }
}