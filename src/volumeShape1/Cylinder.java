package volumeShape1;

class Cylinder extends Circle {

    protected double height;

    public Cylinder (  ) {
    }

    public Cylinder ( Point centerOfCircle , double radius , double height ) {
        super ( centerOfCircle , radius );
        this.height = height;
    }

    protected void calculateArea () {
        this.area = area * 2 + Math.PI * radius * height;
    }

    public void calculateVolume () {
        this.volume = area * height;
    }

    @Override
    public String toString () {
        return "Cylinder{" + "center circle (x,y) = " + "(" + centerOfCircle.getX ()+", " + centerOfCircle.getY () + ")"
                + ", radius=" + radius + " , height=" + height + ", area=" + area + ", volume=" + volume + '}';
    }
}