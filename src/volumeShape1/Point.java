package volumeShape1;

class Point {
    double x;
    double y;

    public Point () {

    }

    Point ( double x , double y ) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString () {
        return "Point{" + "Center circle " + "( " + x + ", " + y + " )" + '}';
    }

    public double getX () {
        return x;
    }

    public double getY () {
        return y;
    }
}
