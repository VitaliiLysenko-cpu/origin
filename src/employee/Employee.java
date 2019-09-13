package employee;

public class Employee {
    private String name;
    private String lastName;
    private double monthlySalary;
    private double raise;

    Employee () {
        this.name = null;
        this.lastName = null;
        this.monthlySalary = 0.0;
    }

  void setRaise ( double raise ) {
      this.raise = raise;
  }

    public double getMonthlySalary () {
        return monthlySalary;
    }

    void setMonthlySalary ( double monthlySalary ) {
        this.monthlySalary = monthlySalary;
    }

    public String getName () {
        return name;
    }

    void setName ( String name ) {
        this.name = name;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName ( String lastName ) {
        this.lastName = lastName;
    }

    public double getSalary () {
        if ( monthlySalary < 0 ) {
            monthlySalary = 0.0;
        }
        return monthlySalary;
    }


    public void print () {
        this.monthlySalary = this.monthlySalary * raise;
        double res = (+ (monthlySalary * 12));
        System.out.println ( "Годовая зарплата = " + res );
    }
}
