package a9_3_3;



public class Tape extends Publication {

    protected float playingTame;

    public Tape ( float playingTame ) {
        this.playingTame = playingTame;
    }

    public Tape ( String title , float prise , float playingTame ) {
        super ( title , prise );
        this.playingTame = playingTame;
    }

    @Override
    public String toString () {
        return "Tape{" + "title=" + title + ", prise=" + prise + ", playingTame=" + playingTame + '}';
    }

    public void setPlayingTame ( float playingTame ) {
        this.playingTame = playingTame;

    }
}
