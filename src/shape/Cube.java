package shape;


public class Cube extends ThreeDimensional {
    private double a;
    private double b;
    private double h;
    private double ar;
    private double vol;

    public Cube ( double a , double b , double h ) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public void display () {
        System.out.print ("Cube  ");
        System.out.println ( "A " + a + ", " + "B " + a + ", " + " H " + a );
    }

    public void areaShape () {
        ar = a * a * 6;
    }

    public void volumeShape () {
        vol = a * a * a;
    }

    public void displayAreaShape () {
        System.out.println ( "Area Shape = " + ar );
        System.out.println ( " Volume = " + vol );
    }
}

