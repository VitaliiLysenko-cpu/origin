package a9_3_3;

public class Publication {
    protected String title;
    protected float prise;

    public Publication () {
    }

    public Publication ( String title , float prise ) {
        this.title = title;
        this.prise = prise;
    }

    public void setTitle ( String title ) {
        this.title = title;
    }

    public void setPrise ( float prise ) {
        this.prise = prise;
    }

    @Override
    public String toString () {
        return "Publication{" + "title=" + title + ", prise=" + prise + '}';
    }
}
