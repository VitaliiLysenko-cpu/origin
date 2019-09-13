package number;

import java.util.Scanner;

public class Main {
    public static void main ( String[] arg ) {
        double numReal1;
        double numReal2;
        double numImag1;
        double numImag2;


        Scanner sc = new Scanner ( System.in );

        numReal1 = sc.nextDouble ();
        numImag1 = sc.nextDouble ();
        numReal2 = sc.nextDouble ();
        numImag2 = sc.nextDouble ();

        Number num = new Number ( numReal1 );
        Number num1 = new Number ( numReal2 );


        WorkWithNumbers workWithNumbers = new WorkWithNumbers ();
        Number res = workWithNumbers.add ( num , num1 );
        res.printNum ();
        res = workWithNumbers.subtract ( num , num1 );
        res.printNum ();
        res = workWithNumbers.multiplication ( num , num1 );
        res.printNum ();
        res = workWithNumbers.divide ( num , num1 );
        res.printNum ();

        ComplexNumber complex = new ComplexNumber ( numReal1 , numImag1 );
        ComplexNumber complex1 = new ComplexNumber ( numReal2 , numImag2 );


        WorkWithComplexNumber workWithComplexNumber = new WorkWithComplexNumber ();
        ComplexNumber resComplex = workWithComplexNumber.add (complex, complex1 );
        resComplex.printNum ();
        resComplex = workWithComplexNumber.subtract (complex, complex1);
        resComplex.printNum ();
        resComplex = workWithComplexNumber.multiplication (complex, complex1);
        resComplex.printNum ();
        resComplex = workWithComplexNumber.divide ( complex , complex1 );
        resComplex.printNum ();


    }
}
