package a9_3_3;

public class Book extends  Publication{
    protected int pageCount;

    public Book () {
    }

    public Book ( int pageCount ) {
        this.pageCount = pageCount;
    }

    public Book ( String title , float prise , int pageCount ) {
        super ( title , prise );
        this.pageCount = pageCount;
    }

    public void setPageCount ( int pageCount ) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString () {
        return "Book{" +  " title=" + title + ", prise=" + prise + ", pageCount=" + pageCount +'}';
    }
}
