//        RealPart: 1.0
//        ImaginaryPart: 1.0
//        --------------------
//        RealPart: 5.0
//        ImaginaryPart: 7.0
//        --------------------
//        I'm in ComplexNumber class
//        I'm in RealNumber class
//        Checking ended.

public class Task11 {
    public static void main(String[] args) {
        RealNumber rn = new ComplexNumber();
        System.out.println(rn);

        System.out.println("--------------------");

        rn = new ComplexNumber(5, 7);
        System.out.println(rn);

        System.out.println("--------------------");
        ComplexNumber cn = new ComplexNumber();
        cn.check();
    }
}
class RealNumber {
    private double realValue;
    public double getRealValue() {
        return realValue;
    }
    public void setRealValue(double r) {
        realValue = r;
    }
    public RealNumber() {
        this(0);
    }
    public RealNumber(double r) {
        setRealValue(r);
    }
    public String toString() {
        return "RealPart: "+getRealValue();
    }
    public void ping() {
        System.out.println("I'm in RealNumber class");
    }
}

class ComplexNumber extends RealNumber {
    private double imaginaryValue;
    public ComplexNumber() {
        super(1.0);
        this.imaginaryValue = 1.0;
    }
    public ComplexNumber(double r, double i) {
        super(r);
        this.imaginaryValue = i;
    }
    public void check() {
        System.out.println("I'm in ComplexNumber class");
        super.ping();
        System.out.println("Checking ended.");
    }
    public String toString() {
        return super.toString() + "\n" + "ImaginaryPart: " + imaginaryValue;
    }
}
