package heater;

public class Heater2 {
    int temperature;
    int max;
    int min;
    int increment;

    Heater2 () {
        this.temperature = 15;
        this.max = max;
        this.min = min;
    }

    public int getTemperature () {
        return temperature;
    }

    public int warmer () {
        if ( max < ( temperature + increment ) ) {
            temperature += increment;
        } else {
            temperature = max;
        }
        return temperature;
    }

    public int cooler () {
        if ( min > temperature - increment ) {
            temperature -= increment;
        } else {
            temperature = min;
        }
        return temperature;
    }

    public void setIncrement ( int increment ) {
        if ( increment < 0 ) {
            try {
                throw new NullPointerException ( "Введен неверный параметр" );
            } catch (NullPointerException e) {
                System.out.println ( e.getMessage () );
            }
        }
        this.increment = increment;

    }
}
