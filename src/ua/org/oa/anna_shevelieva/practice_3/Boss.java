package ua.org.oa.anna_shevelieva.practice_3;

public class Boss extends Employee{
    private double weeklySalary;

// four-argument constructor
    public  Boss( String first, String last, double salary, String position )
      {
        super( first, last, position); // pass to Employee constructor
        setWeeklySalary( salary ); // validate and store salary
      } // end four-argument Boss constructor

      // set salary
              public void setWeeklySalary( double salary )
      {
                 if ( salary >= 0.0 )
                     weeklySalary = salary;
                 else
                    throw new IllegalArgumentException(
                               "Weekly salary must be >= 0.0" );
              } // end method setWeeklySalary

              // return salary
              public double getWeeklySalary()
      {
                 return weeklySalary;
              } // end method getWeeklySalary

              // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings()
    {
        return getWeeklySalary();
    } // end method earnings

    // return String representation of Boss object
    @Override
    public String toString() {

        return String.format( "salaried employee: %s\n%s: $%,.2f",
                      super.toString(), "weekly salary" , getWeeklySalary() );
    } // end method toString
} // end class Boss

