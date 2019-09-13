package date;

import java.util.Scanner;

public class DataTest {
    public static void main ( String[] args ) {
        int dat;
        int mon;
        int year;
        Scanner sc = new Scanner ( System.in );
        dat = sc.nextInt ();
        mon = sc.nextInt ();
        year = sc.nextInt ();
        Date date = new Date ( dat, mon, year );
        date.setDay ( dat );
        date.setMonth ( mon );
        date.setYear ( year );
        date.displayDate ();
    }
}
