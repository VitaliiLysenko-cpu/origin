package volumeShape1;

import java.util.Scanner;

class Main {
    public static void main ( String[] args ) {
        Point centerOfCircle;
        double x;
        double y;
        double radius;
        double height;

        Scanner sc = new Scanner ( System.in );

        x = sc.nextDouble ();
        y = sc.nextDouble ();
        radius = sc.nextDouble ();
        height = sc.nextDouble ();

        centerOfCircle = new Point ( x, y );

        System.out.println ( centerOfCircle);

        Circle circle = new Circle (centerOfCircle, radius);
        circle.setRadius ( radius );
        circle.calculateArea ();
        System.out.println (circle);

        Cylinder cylinder = new Cylinder ( centerOfCircle, radius, height );
        cylinder.setRadius ( radius );
        cylinder.calculateArea ();
        cylinder.calculateVolume ();
        System.out.println (cylinder);


    }
}