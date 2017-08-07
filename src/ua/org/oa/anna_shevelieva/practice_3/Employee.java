package ua.org.oa.anna_shevelieva.practice_3;
// Employee abstract superclass.

public abstract class Employee

{
       private String firstName;
       private String lastName;
       private String employeePosition;

       // three-argument constructor
       public Employee( String first, String last, String position)
      {
             firstName = first;
             lastName = last;
             employeePosition = position;

      } // end three-argument Employee constructor

      // set first name
      public void setFirstName( String first )
      {
             firstName = first; // should validate
      } // end method setFirstName

              // return first name
      public String getFirstName()
      {
             return firstName;
      } // end method getFirstName

      // set last name
      public void setLastName( String last )
      {
             lastName = last; // should validate
      } // end method setLastName

      // return last name
      public String getLastName()
      {
             return lastName;
      } // end method getLastName

      // set position
      public void setEmployeePosition( String position )
     {
         employeePosition = position; // should validate
     } // end method setLastName

     // return last name
     public String getEmployeePosition()
     {
        return employeePosition;
     } // end method getEmployeePosition

      // return String representation of Employee object
      @Override
      public String toString()
     {
             return String.format( " %s %s\nemployee position: %s", getFirstName(), getLastName(), getEmployeePosition() );
          } // end method toString

              // abstract method overridden by concrete subclasses
              public abstract double earnings(); // no implementation here
   } // end abstract class Employee
