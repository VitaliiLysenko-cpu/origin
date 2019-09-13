package rectangle;

public class Rectangle {
    double length;
    double width;
    double perim;
    double ar;

    public Rectangle () {
        this.length = 1.0;
        this.width = 1.0;
    }

    public void perimeter () {
        perim = length * 2 + width * 2;
    }


    public void area () {
        ar = length * width;
    }

    public double getLength () {
        return length;
    }

    public void setLength ( double length ) {
        if ( length < 0 || length > 20 ) {
            try {
                throw new NullPointerException ( "Введен неверный параметр" );
            } catch (NullPointerException e) {
                System.out.println ( e.getMessage () );
            }
        }
        this.length = length;
    }

    public double getWidth () {
        return width;
    }

    public void setWidth ( double width ) {
        if ( width < 0 || width > 20 ) {
            try {
                throw new NullPointerException ( "Введен неверный параметр" );
            } catch (NullPointerException e) {
                System.out.println ( e.getMessage () );
            }
        }
        this.width = width;
    }

    public void print () {
        System.out.println ( "perimeter = " + perim);
        System.out.println ( "calculateArea = " + ar);
    }
}
