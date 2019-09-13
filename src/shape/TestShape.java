package shape;

import java.util.Scanner;

public class TestShape {
    public static void main ( String[] args ) {
        double aA;
        double bB;
        double hH;

        Scanner sc = new Scanner ( System.in );
        aA = sc.nextDouble ();
        bB = sc.nextDouble ();
        hH = sc.nextDouble ();

        Square square = new Square ( aA , bB );
        square.display ();
        square.areaShape ();
        square.displayAreaShape ();

        Parallelogram parallelogram = new Parallelogram ( aA , bB , hH );
        parallelogram.display ();
        parallelogram.areaShape ();
        parallelogram.displayAreaShape ();

        Cube cube = new Cube ( aA , bB , hH );
        cube.display ();
        cube.areaShape ();
        cube.volumeShape ();
        cube.displayAreaShape ();

        Parallelepiped parallelepiped = new Parallelepiped ( aA , bB , hH );
        parallelepiped.display ();
        parallelepiped.areaShape ();
        parallelepiped.volumeShape ();
        parallelepiped.displayAreaShape ();
    }
}
