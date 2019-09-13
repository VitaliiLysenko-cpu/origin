package publication;

import java.util.Scanner;

public class MainPublication {
    public static void main ( String[] args ) {
        String title;
        float prise;
        int pageCount;
        int playingTime;
        float sum;
        Scanner sc = new Scanner ( System.in );
        title = sc.next ();
        prise = sc.nextFloat ();
        pageCount = sc.nextInt ();
        playingTime = sc.nextInt ();
        sum = sc.nextFloat ();


        Publication publication = new Publication ();
        publication.setTitle ( title );
        publication.setPrice ( prise );
        publication.putdate ();

        Book book = new Book ();

        book.setPageCount ( pageCount );
        book.putBookdata ();

        Tape tape = new Tape ();

        tape.setPlayingTime ( playingTime );
        tape.putTareData ();


    }
}
