package volumeShape;

 class Cylinder extends Circle {
    public double height;

    public Cylinder () {
        this.height = 1;
    }

    public Cylinder ( double x , double y , double radius , double height ) {
        super ( x , y , radius );
        this.height = height;
    }

    @Override
    public void calculateArea () {
        Circle circle = new Circle ( x , y , radius );
        circle.calculateArea ();
        area = circle.getArea () * 2 + 2 * Math.PI * radius * height;
    }


    public void calculateVolume () {
        Circle circle = new Circle ( x , y , radius );
        circle.calculateArea ();
        volume = circle.getArea () * height;
    }

    @Override
    public String toString () {
        return "Cylinder{" + "height=" + height + ", radius=" + radius + ", x=" + x + ", y=" + y + ", area=" + area + ", volume=" + volume + '}';
    }
}
