package publication;

public class Tape extends Publication implements ISales {
    protected int playingTime;

    public Tape () {
        playingTime = 0;
    }

    public void setPlayingTime ( int playingTime ) {
        this.playingTime = playingTime;
    }

    public void putTareData () {

        System.out.println ( "Playing tame" + playingTime );
    }
}
