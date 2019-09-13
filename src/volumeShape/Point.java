package volumeShape;

 class Point extends Shape {
    protected double x;
    protected double y;

    Point () {
    }

    Point ( double x , double y ) {
        this.x = x;
        this.y = y;
    }

    public double getX () {
        return x;
    }

    public void setX ( double x ) {
        this.x = x;
    }

    public double getY () {
        return y;
    }

    public void setY ( double y ) {
        this.y = y;
    }

    @Override
    public void calculateArea () {
    }

    @Override
    public void calculateVolume () {
    }

    @Override
    public String toString () {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
}
