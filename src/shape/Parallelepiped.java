package shape;

public class Parallelepiped extends ThreeDimensional {
    private double a;
    private double b;
    private double h;
    private double ar;
    private double vol;

    public Parallelepiped ( double a , double b , double h ) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public void display () {
        System.out.println ("Parallelepiped  ");
        System.out.println ( "A " + a + ", " + "B " + b + ", " + " H " + h );
    }

    public void areaShape () {
        ar = ( a * b + a * h + b * h ) * 2;
    }

    public void volumeShape () {
        vol = a * b * h;
    }

    public void displayAreaShape () {
        System.out.println ( "Area Shape = " + ar );
        System.out.println ( " Volume = " + vol );
    }
}
