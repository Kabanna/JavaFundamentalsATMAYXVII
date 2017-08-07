package ua.org.oa.anna_shevelieva.practice_3;

public class PayrollSystemTest
{
    public static void main( String[] args )
    {
// create subclass objects
    Boss Boss = new Boss ("Eugene", "Riabukha", 99999, "Boss");
    HourlyWorker hourlyWorker =
    new HourlyWorker("Dima", "Petruk", "HourlyWorker", 150, 6.5 );
    CommissionWorker commissionWorker =
    new CommissionWorker("Alex",  "Shlapak", "CommisionWorker", 10000, .06 );
    PieceWorker pieceWorker =
    new PieceWorker("Stas", "Savinov", "PieceWorker", 5000, .04, 300 );

    System.out.println( "Employees processed individually:\n" );

    System.out.printf( "%s\n%s: $%,.2f\n\n",
                         Boss, "earned", Boss.earnings() );
    System.out.printf( "%s\n%s: $%,.2f\n\n",
                    hourlyWorker, "earned", hourlyWorker.earnings() );
    System.out.printf( "%s\n%s: $%,.2f\n\n",
                    commissionWorker, "earned", commissionWorker.earnings() );
    System.out.printf( "%s\n%s: $%,.2f\n\n",
                         pieceWorker,
                    "earned", pieceWorker.earnings() );

    // create four-element Employee array
    Employee[] employees = new Employee[  4 ];

    // initialize array with Employees
                 employees[ 0 ] = Boss;
                 employees[ 1 ] = hourlyWorker;
                 employees[ 2 ] = commissionWorker;
                 employees[ 3 ] = pieceWorker;

                 System.out.println( "Employees processed polymorphically:\n" );

                 // generically process each element in array employees
                 for ( Employee currentEmployee : employees )
                 {
                    System.out.println( currentEmployee ); // invokes toString

                    // determine whether element is a BasePlusCommissionEmployee
                    if ( currentEmployee instanceof PieceWorker )
                    {
                       // downcast Employee reference to
                       // BasePlusCommissionEmployee reference
                        PieceWorker employee =
                          ( PieceWorker ) currentEmployee;

                       employee.setBaseSalary( 1.10 * employee.getBaseSalary() );

                       System.out.printf(
                          "new base salary with 10%% increase is: $%,.2f\n",
                          employee.getBaseSalary() );
                    } // end if

                    System.out.printf(
                       "earned $%,.2f\n\n", currentEmployee.earnings() );
                 } // end for

        // get type name of each object in employees array
                 for ( int j = 0; j < employees.length; j++ )
                    System.out.printf(  "Employee %d is a %s\n", j,
                       employees[ j ].getClass().getName() );
              } // end main
    } // end class PayrollSystemTest
