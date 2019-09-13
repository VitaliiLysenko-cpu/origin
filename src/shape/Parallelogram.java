package shape;


public class Parallelogram extends TwoDimensional {
    private double a;
    private double b;
    private double h;
    private double ar;

    public Parallelogram ( double a , double b , double h ) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public void display () {
        System.out.println ("Parallelogram  ");
        System.out.println ( "A " + a + ", " + "B " + b + ", " + " H " + h );
    }

    public void areaShape () {
        ar = a * h;
    }

    public void volumeShape () {

    }

    public void displayAreaShape () {
        System.out.println ( "Area Shape = " + ar );
    }
}

