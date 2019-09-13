package invoice;

public class Invoice {
    int partNumber;
    String description;
    int quantity;
    double price;
    double sum;

    public Invoice () {
        partNumber = 0;
        description = null;
        quantity = 0;
        price = 0.0;
    }

    public int getPartNumber () {
        return partNumber;
    }

    public void setPartNumber ( int partNumber ) {
        this.partNumber = partNumber;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription ( String description ) {
        this.description = description;
    }

    public int getQuantity () {
        return quantity;
    }

    public void setQuantity ( int quantity ) {
        this.quantity = quantity;
    }

    public double getPrice () {
        return price;
    }

    public void setPrice ( double price ) {
        this.price = price;
    }

    public double getInvoiceAmount () {
        if ( price < 0 ) {
            price = 0;
        }
        if ( quantity < 0 ) {
            quantity = 0;
        }
        sum = price * quantity;
        return sum;
    }

    @Override
    public String toString () {
        return "Invoice{" + "partNumber=" + partNumber + ", description='" + description + '\'' + ", quantity=" + quantity + ", price=" + price + '}';
    }

    public void print(){
        System.out.println (toString ());
        System.out.println ("Total sum" + sum);
    }
}
