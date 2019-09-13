package volumeShape;

 class Circle extends Point {
    protected double radius;

    public Circle () {
        super ( 0 , 0 );
        this.radius = 1;
    }

    public Circle ( double x , double y , double radius ) {
        super ( x , y );
        this.radius = radius;
    }


    public void setRadius ( double radius ) {
        if ( radius > 0 ) {
            this.radius = radius;
        }
    }

    @Override
    public void calculateArea () {
        this.area = Math.PI * radius * radius;
    }

    @Override
    public void calculateVolume () {
        super.calculateVolume ();
    }

    @Override
    public String toString () {
        return "Circle{" + "radius=" + radius + ", x=" + x + ", y=" + y + ", calculateArea=" + area + '}';
    }

}
