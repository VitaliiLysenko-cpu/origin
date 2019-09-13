package volumeShape1;

abstract class Shape {
    protected double area;
    protected double volume;

    abstract void calculateArea ();

    abstract void calculateVolume ();

    public double getArea () {
        return area;
    }

    @Override
    public String toString () {
        return "Shape{" + "calculateArea=" + area + ", calculateVolume=" + volume + '}';
    }

}
