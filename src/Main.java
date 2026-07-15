public class Main {

    public static void main(String[] args) {

        int currentYear = 2026;

        // Test valid patient using original (chained) constructor
        Patient validPt = new Patient(1001, "John Doe", 1978, 175.5, 78.0);
        System.out.println(validPt.getDetails(currentYear));
        System.out.println();

        // Test invalid patient
        Patient invalidPt = new Patient(1002, "Joe Dohn", -1, -160.0, -65.0);
        System.out.println(invalidPt.getDetails(currentYear));
        System.out.println();

        // Test invalid currentYear
        System.out.println(validPt.getDetails(1026));
        System.out.println();

        // Test new constructor with blood group and phone number
        Patient patient = new Patient(1003, "John Doe", 1978, 175.5, 78.0, "A", "082-567-6463");
        System.out.printf("Patient BMI: %.2f%n", patient.getBMI());
        System.out.println("Blood Group: " + patient.getBloodGroup());
        System.out.println("Phone Number: " + patient.getPhoneNumber());
    }
}