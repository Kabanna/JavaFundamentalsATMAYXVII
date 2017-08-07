package ua.org.oa.anna_shevelieva.practice_3;
// PieceWorker class extends CommissionWorker.

public class PieceWorker extends CommissionWorker{
    private double baseSalary; // base salary per week
    double rate, sales;

    // five-argument constructor
    public PieceWorker( String first, String last, String position,
         double sales, double rate, double salary )
    {
        super( first, last, position, sales, rate);
        setBaseSalary( salary ); // validate and store base salary
        this.rate  = rate;
        this.sales = sales;
    } // end five-argument PieceWorker constructor

    // set base salary
    public void setBaseSalary( double salary )
    {
        if ( salary >= 0.0 )
            baseSalary = salary;
        else
        throw new IllegalArgumentException(
                "Base salary must be >= 0.0" );
    } // end method setBaseSalary

    // return base salary
    public double getBaseSalary()
    {
        return baseSalary;
    } // end method getBaseSalary

    // calculate earnings; override method earnings in CommissionEmployee
    @Override
    public double earnings()
    {
        return (this.rate * this.sales);
    }// end method earnings

    // return String representation of PieceWorker object
    @Override
    public String toString()
    {
        return String.format( "%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary() );
    } // end method toString
} // end class PieceWorker
