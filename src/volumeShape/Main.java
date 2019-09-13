package volumeShape;

import java.util.Scanner;

class Main {
    public static void main ( String[] args ) {

        double x;
        double y;
        double radius;
        double height;

        Scanner sc = new Scanner ( System.in );
        x = sc.nextDouble ();
        y = sc.nextDouble ();
        radius = sc.nextDouble ();
        height = sc.nextDouble ();

        Point point = new Point ( x , y );
        System.out.println ( point );

        Circle circle = new Circle ();
        Circle circle1 = new Circle ( x , y , radius );
        circle1.setRadius ( radius );
        circle1.calculateArea ();
        circle1.calculateVolume ();
        System.out.println (circle);
        System.out.println ( circle1 );

        Cylinder cylinder = new Cylinder ();
        Cylinder cylinder1 = new Cylinder ( x , y , radius , height );
        cylinder1.calculateArea ();
        cylinder1.calculateVolume ();
        System.out.println (cylinder);
        System.out.println ( cylinder1 );
    }
}
