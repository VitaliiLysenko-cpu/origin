package number;

import java.util.Objects;

class Number implements IPrintNamber {

    private double a;

    Number ( double a ) {
        this.a = a;
    }

    protected double getA () {
        return a;
    }

    //@Override
    public String toString () {
        return "Number{" + "a=" + a + '}';
    }

    @Override
    public boolean equals ( Object o ) {
        if ( this == o ) return true;
        if ( ! ( o instanceof Number ) ) return false;
        Number number = ( Number ) o;
        return Double.compare ( number.getA () , getA () ) == 0;
    }

    @Override
    public void printNum ( ){
        System.out.println ( toString ());
    }
}