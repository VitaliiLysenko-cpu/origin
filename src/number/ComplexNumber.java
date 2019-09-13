package number;

public class ComplexNumber extends Number implements IPrintNamber {
    private double imag;

    ComplexNumber ( double real , double imag ) {
        super ( real );
        this.imag = imag;
    }

    public double getImag () {
        return imag;
    }

    @Override
    public String toString () {
        return "ComplexNumber{" + "imag=" + imag + '}';
    }

    @Override
    public void printNum () {

        System.out.println (  );
    }


}
