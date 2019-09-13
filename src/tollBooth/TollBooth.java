package tollBooth;

public class TollBooth {
    private int car;
    private double sum;

    public TollBooth () {
        this.car = 0;
        this.sum = 0;
    }

    public void payCar () {
        this.car += 1;
        this.sum += 0.5;
    }

    public void nopayCar () {
        this.car += 1;
    }

    public int getCar () {
        return car;
    }

    public double getSum () {
        return sum;
    }

    @Override
    public String toString () {
        return "TollBooth{" + "car=" + car + ", sum=" + sum + '}';
    }

    public void display () {
        System.out.println ( toString () );
    }
}
