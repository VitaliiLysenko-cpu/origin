package tollBooth;

import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        String cha ;
        Scanner sc = new Scanner ( System.in );
        cha = "open";
        TollBooth tollBooth = new TollBooth ();
        while (! cha.equals ( "\u0071" )) {
            System.out.println ( " 'Р' - оплачиваемй проезд" );
            System.out.println ( " 'N' - бесплатный проезд" );
            System.out.println ( " 'q' - вывод результатов" );
            cha = sc.next ();
            if ( cha.equals ( "\u0070" ) ) {
                tollBooth.payCar ();
               continue;
            }
            if ( cha.equals ( "\u006e" ) ) {
                tollBooth.nopayCar ();
            }
        }
        tollBooth.display ();
    }
}
