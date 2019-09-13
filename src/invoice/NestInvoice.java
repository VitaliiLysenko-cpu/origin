package invoice;

import java.util.Scanner;

public class NestInvoice {
    public static void main ( String[] args ) {
        int number;
        String descript;
        int quant;
        double price;
        Scanner sc = new Scanner ( System.in );
        number = sc.nextInt ();
        descript = sc.next ();
        quant = sc.nextInt ();
        price = sc.nextDouble ();
        Invoice invoice = new Invoice ();

        invoice.setPartNumber ( number );
        invoice.setDescription ( descript );
        invoice.setQuantity (quant);
        invoice.setPrice ( price );
        invoice.getInvoiceAmount ();
        invoice.print ();
    }
}
