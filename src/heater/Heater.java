package heater;

public class Heater {
    int temperature;
    int incr = 5;
    public Heater () {
        this.temperature = 15;
    }

    public int getTemperature () {
        return temperature;
    }

    public int warmer () {
        temperature += incr;
        return temperature;

    }

    public int cooler () {
        temperature -= incr;
        return temperature;
    }
}
