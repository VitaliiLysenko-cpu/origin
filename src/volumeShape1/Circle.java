package volumeShape1;

class Circle extends Shape {
    protected Point centerOfCircle;

    protected double radius;

    public Circle () {
    }

    public Circle ( Point centerOfCircle, double radius ) {
        this.centerOfCircle = centerOfCircle;
        this.radius = radius;
    }

    public void setRadius ( double radius ) {
       if (radius > 0){
           this.radius = radius;
       }else {
           System.out.println ("Введите правильное значение радиуса");
       }
    }

    protected void calculateArea () {
        this.area = Math.PI * radius * radius;
    }

    public void calculateVolume () {

    }

    @Override
    public String toString () {
        return "Circle{ center circle (x,y) = " + "(" + centerOfCircle.getX ()+", " + centerOfCircle.getY () + ")" +
                " , radius = " + radius + ", Area = " + area + '}';
    }

}
