package number;

public class WorkWithComplexNumber implements IOperetionOverComplexNumber {

    @Override
    public ComplexNumber add ( ComplexNumber real,  ComplexNumber imag) {

        ComplexNumber complex = new ComplexNumber ( real.getA () + real.getA () ,
                imag.getImag () + imag.getImag () );
        return complex;
    }

    @Override
    public ComplexNumber subtract (ComplexNumber real,  ComplexNumber imag) {
        ComplexNumber complex = new ComplexNumber ( real.getA () - real.getA () ,
                imag.getImag () - imag.getImag () );
        return complex;
    }

    @Override
    public ComplexNumber multiplication ( ComplexNumber real,  ComplexNumber imag ) {
        ComplexNumber complex = new ComplexNumber ( ( real.getA () * real.getA () -
                imag.getImag () * imag.getImag () ) ,
                ( real.getA () * imag.getImag () +
                        imag.getImag () * imag.getA () ) );
        return complex;
    }

    @Override
    public ComplexNumber divide (  ComplexNumber real,  ComplexNumber imag ) {
        ComplexNumber complex = new ComplexNumber ( ( real.getA () * real.getA () +
                imag.getImag () * imag.getImag () /
                        ( real.getA () * real.getA () +
                                imag.getImag () * imag.getImag () ) ) ,
                ( imag.getImag () * real.getA () -
                        real.getA () * imag.getImag () ) /
                        ( imag.getA () * real.getA () +
                                imag.getImag () * imag.getImag () ) );
        return complex;
    }
}


