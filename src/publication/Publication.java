package publication;

public class Publication {
    protected String title;
    protected float price;

    public Publication () {
    }

    public String getTitle () {

        return title;
    }

    public void setTitle ( String title ) {
        this.title = title;
    }

    public void setPrice ( float price ) {
        this.price = price;
    }

    public void putdate () {
        System.out.println ( "Title " + '"' + title + '"' );
        System.out.println ( "Price " + price );
    }
}
