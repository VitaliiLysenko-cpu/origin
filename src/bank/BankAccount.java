package bank;

public class BankAccount {
    private double balance;

    public BankAccount () {
        this.balance = 0;
    }

    public double deposit ( int sum ) {
        balance += sum;
        return balance;
    }

    public double withdrawal ( int sum ) {
        if ( balance < sum){
            System.out.println (" На вашому рахунку не достатньо коштів ");
        }else{
            balance -= sum;
        }
        return balance;
    }

    public double getBalanse () {
        return balance;
    }

    @Override
    public String toString () {
        return "BankAccount{" + "balanse=" + balance + '}';
    }
}


