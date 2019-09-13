package employee;

import java.util.Scanner;

public class TestEmrloyee {

    public static void main ( String[] args ) {

        String name, name1;
        String lastName, lastName1;
        double monthlySalary, monthlySalary1;
        double raise, raise1;

        Scanner sc = new Scanner ( System.in );

        System.out.println ( "Имя" );
        name = sc.next ();
        name1 = sc.next ();

        System.out.println ( "Фамилия" );
        lastName = sc.next ();
        lastName1 = sc.next ();

        System.out.println ( "Месячный оклад" );
        monthlySalary = sc.nextDouble ();
        monthlySalary1 = sc.nextDouble ();


        System.out.println ( "Прибавка к зарплате" );
        raise = sc.nextDouble ();
        raise1 = sc.nextDouble ();

        Employee first = new Employee ();
        first.setName ( name );
        first.setLastName ( lastName );
        first.setMonthlySalary ( monthlySalary );
        first.setRaise ( raise );
        first.print ();


        Employee second = new Employee ();
        second.setName ( name1 );
        second.setLastName ( lastName1 );
        second.setMonthlySalary ( monthlySalary1 );
        second.setRaise ( raise1 );
        second.print ();
    }
}
