/**
 * Create a java program that satisfies the following requirements:
 * 1. Create a class that describes the given object. In each class:
 * Define a minimum of 5 fields of three different types characterizing the given object;
 * Create a method that calculates parameters based on the values ​​of the object fields;
 * Define a method for displaying information about an object on the screen.
 * 2. Each class, field, method should have a name that reflects its essence and comments describing their purpose.
 * 3. At the stage of programming, agreements from the java code convention should be used.
 * 4. Test the class you created by creating several instances of the class (in the main () method) that describes the object, initializing the attribute variables of each instance, and calling its methods.
 * 5. The name of the package in which the class / class is created must be in the format ua.org.oa. <Jira Login>.
 * 6. The indivudual folder in the SVN repository to save the completed tasks is located at http://oracle-academy.org.ua/svn/<Project Name> / <Jira login>

 * Object:
 * Patient of the hospital
 *
 */

package ua.org.oa.anna_shevelieva.home_work_ATMAYXVII_3;

public class Patient {
    private String patientName;
    private int patientAge;
    private String  patientGender;
    private String disease;
    private Double height;

    Patient (String patientName, int patientAge, String patientGender, String disease, Double height)
    {
        this.patientName=patientName;
        this.patientGender=patientGender;
        this.patientAge=patientAge;
        this.disease=disease;
        this.height=height;
    }

    /**
     * Print list of Patients
     */
    public void printPatientInformation(){
        System.out.format(" Patient: %s\n Gender: %s\n " + "Age: %d\n Height: %f\n" + " Disease: %s\n" ,
                this.patientName,
                this.patientGender,
                this.patientAge,
                this.height,
                this.disease);
    }
}
