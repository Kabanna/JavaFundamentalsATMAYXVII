package ua.org.oa.anna_shevelieva.home_work_ATMAYXVII_3;

public class PatientTest {
    public static void main(String[] args) {

        Patient p1 = new Patient ("Misha ",12,"Male","heart patient",190.9);
        Patient p2 = new Patient ("Sara ",23,"Female","earnose",185.4);
        Patient p3 = new Patient ("Alla ",31,"Female","earnose",180.0);
        Patient p4 = new Patient ("Eugene ",15,"Male","heart patient",174.0);
        Patient p5 = new Patient ("Roma ",18,"Male","eye",169.0);
        Patient p6 = new Patient ("Sem ",21,"Male","eye", 163.0);

        System.out.println("~~~ Information about patient ~~~");
        p1.printPatientInformation();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        p2.printPatientInformation();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        p3.printPatientInformation();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        p4.printPatientInformation();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        p5.printPatientInformation();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        p6.printPatientInformation();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
