package number;

public class WorkWithNumbers implements IOperationsOverNumbers {


    @Override
    public Number add ( Number first , Number second ) {
      Number number = new Number( first.getA () + second.getA () );
        return number ;
    }

    @Override
    public Number subtract ( Number first , Number second ) {
        Number number = new Number ( first.getA() - second.getA() );
        return number;
    }

    @Override
    public Number multiplication ( Number first , Number second ) {
        Number number = new Number ( first.getA () * second.getA () );
        return number;
    }

    @Override
    public Number divide ( Number first , Number second ) {
        Number number = new Number ( first.getA () / second.getA () );
        return number;
    }

}
