package shape;

public class Square extends TwoDimensional {
    private double a;
    private double b;
    private double ar;

    public Square ( double a , double b ) {
        this.a = a;
        this.b = b;
    }

    public double getA () {
        return a;
    }

    public double getB () {
        return b;
    }

    public double getAr () {
        return ar;
    }

    public void display () {
        System.out.print ("Square  ");
        System.out.println ( "A " + a + ", " + "B " + b );
    }

    public void areaShape () {
        ar = a * b;
    }

    public void volumeShape () {

    }

    public void displayAreaShape () {
        System.out.println ( "Area Shape = " + ar );
    }

}
