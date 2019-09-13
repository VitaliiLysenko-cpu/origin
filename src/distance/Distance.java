package distance;

import java.util.Scanner;

public class Distance {
    private int feet;
    private int inch;
    private int feet1;
    private int inch1;

    public Distance () {
        this.feet = 0;
        this.inch = 0;
    }


    public Distance ( int feet , int inch, int feet1 , int inch1 ) {
        this.feet1 = feet1;
        this.inch1 = inch1;
        this.feet = feet;
        this.inch = inch;
    }

    public static void main ( String[] args ) {
        int feet;
        int feet1;
        int inch;
        int inch1;
        Scanner sc = new Scanner ( System.in );
        feet = sc.nextInt ();
        inch = sc.nextInt ();
        feet1 = sc.nextInt ();
        inch1 = sc.nextInt ();
        Distance dist = new Distance ();

        Distance distance = new Distance ( feet , inch , feet1 , inch1 );
        distance.addDistance ();
        distance.isGreater ();
        distance.isSmaller ();
        distance.isGreaterEqual ();
        distance.isSmallerEqual ();
        distance.isEqual ();
        distance.isNotEqual ();
        distance.print ();
    }

    public void addDistance () {
        this.feet = this.feet + feet1;
        this.inch = this.inch + inch1;
        if ( this.inch >= 12 ) {
            this.feet += this.inch / 12;
            this.inch = this.inch - 12;
        }

    }

    public boolean isGreater () {
        boolean longer;
        if ( this.feet > feet1 || ( this.feet == feet1 && this.inch > inch1 ) ) {
            longer = true;
        } else {
            longer = false;
        }
        return longer;
    }

    public boolean isSmaller () {
        boolean shorter;
        if ( this.feet < feet1 || ( this.feet == feet1 && this.inch < inch1 ) ) {
            shorter = true;
        } else {
            shorter = false;
        }
        return shorter;
    }

    public boolean isGreaterEqual () {
        boolean longer_equal;
        if ( this.feet > feet1 || ( this.feet == feet1 && this.inch >= inch1 ) ) {
            longer_equal = true;
        } else {
            longer_equal = false;
        }
        return longer_equal;
    }

    public boolean isSmallerEqual () {
        boolean shorter_equal;
        if ( this.feet < feet1 || ( this.feet == feet1 && this.inch <= inch1 ) ) {
            shorter_equal = true;
        } else {
            shorter_equal = false;
        }
        return shorter_equal;
    }

    public boolean isEqual () {
        boolean equal;
        if ( this.feet == feet1 || this.inch == inch1 ) {
            equal = true;
        } else {
            equal = false;
        }
        return equal;
    }

    public boolean isNotEqual () {
        boolean not_equal;
        if ( this.feet != feet1 || this.inch != inch1 ) {
            not_equal = true;
        } else {
            not_equal = false;
        }
        return not_equal;
    }

    @Override
    public String toString () {
        return "Distance{" + "feet=" + feet + ", inch=" + inch +  '}';
    }

    public void print () {
        System.out.println ( toString () );
        System.out.println (isGreater ()+", "+isSmaller ()+", "+isGreaterEqual()+", "+isSmallerEqual ()+", "+isEqual ()+", "+isNotEqual ());

    }
}
