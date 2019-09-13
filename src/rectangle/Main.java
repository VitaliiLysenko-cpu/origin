package rectangle;

import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        double wid_th = sc.nextDouble ();
        double leng_th = sc.nextDouble ();
        Rectangle rectangle = new Rectangle ();
        rectangle.setWidth ( wid_th );
        rectangle.setLength ( leng_th );
        rectangle.perimeter ();
        rectangle.area ();
        rectangle.print ();
    }
}
