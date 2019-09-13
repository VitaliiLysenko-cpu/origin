package a9_3_3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain_a9_3_3 {
    public static void main ( String[] args ) {
        String title;
        float prise;
        int pageCount;
        float playnigTame;
        int caseList = 0;
        String numberElement;

        Scanner sc = new Scanner ( System.in );
        title = sc.next ();
        prise = sc.nextFloat ();
        pageCount = sc.nextInt ();
        playnigTame = sc.nextFloat ();

        ArrayList <String> publicationList = new ArrayList <> ();

        Publication publication = new Publication ( title , prise );
        System.out.println ( publication );

        publicationList.add ( caseList , publication.toString () );
        caseList++;

        Book book = new Book ( title , prise , pageCount );
        System.out.println ( book );

        publicationList.add ( caseList , book.toString () );
        caseList++;

        Tape tape = new Tape ( title , prise , playnigTame );
        System.out.println ( tape );

        publicationList.add ( caseList , tape.toString () );
        caseList++;


        for (int i = 0; i < caseList; i++) {
            numberElement = publicationList.get ( i );
            System.out.println ( numberElement );
        }
        System.out.println ( publicationList.toString () );
    }
}
