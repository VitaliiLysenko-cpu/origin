package point;

public class AreaCircle extends Circle {
    protected double area ;

    public AreaCircle (  Circle circle ) {
        super(circle.x , circle.y, circle.radius);
    }

    public AreaCircle ( double x , double y , double radius, double circumference ) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.circumference = circumference;
    }

    public void area () {
        area = circumference * radius;
    }

}
