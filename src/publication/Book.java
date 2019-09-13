package publication;

public class Book extends Publication implements ISales{
    protected int pageCount;

    public Book () {
    }

    public void setPageCount ( int pageCount ) {

        this.pageCount = pageCount;
    }

    public void putBookdata () {

        System.out.println ( "Page count " + pageCount );

    }
}
