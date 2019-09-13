package point;

public class Cylinder extends AreaCircle {
    protected double height;
    protected double areaCylinder;
    protected double volumeCylinder;



    public Cylinder ( double height , AreaCircle areaCircle  ) {
        super ( areaCircle.x , areaCircle.y , areaCircle.radius , areaCircle.circumference );
        this.height = height;
    }


    public void cylinderArea () {
        areaCylinder = ( area * 2 ) + ( circumference * height );
    }

    public void cylinderVolume () {
        volumeCylinder = area * height;
    }

    @Override
    public String toString () {
        return "Cylinder{" + "height=" + height + ", areaCylinder=" + areaCylinder + ", volumeCylinder=" + volumeCylinder + '}';
    }
}
