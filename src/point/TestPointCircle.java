package point;

import java.util.Scanner;

public class TestPointCircle {
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

        Point point = new Point ( x, y );
        point.setY ( y );
        point.setX ( x );
        System.out.println (point);

        Circle circle = new Circle ( x, y, radius );
        circle.setRadius ( radius );
        circle.circumference ();
        System.out.println (circle);

        AreaCircle areaCircle = new AreaCircle ( x,y,radius,circle.circumference);
        areaCircle.area ();

        Cylinder cylinder = new Cylinder ( height,  areaCircle );
        cylinder.area ();
        cylinder.cylinderArea ();
        cylinder.cylinderVolume ();
        System.out.println (cylinder);
    }
}
