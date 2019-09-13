package point;

public class Circle extends Point {
    protected double radius;
    double circumference;

    public Circle () {
        this.x = 0;
        this.y = 0;
    }

    public Circle ( double radius , Point point) {
        super(point.x, point.y);
        this.radius = radius;
    }

    public Circle ( double x , double y , double radius ) {
        super ( x , y );
        this.radius = radius;
    }

    public double getRadius () {
        return radius;
    }

    public void setRadius ( double radius ) {
        if(radius > 0) {
            this.radius = radius;
        }else {
            System.out.println ("Введите правильное значение радиуса");
        }
    }
    public void circumference () {
        circumference = Math.PI * radius * 2;
    }

    @Override
    public String toString () {
        return "Circle{" + ", radius=" + radius + ", circumference=" + circumference + '}';
    }
}
