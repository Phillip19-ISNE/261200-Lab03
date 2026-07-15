public class Patient {
    private int id; //HN
    private String name;
    private int birthYear;
    private double height; //in cm
    private double weight; //in kg
    private String bloodGroup;
    private String phoneNumber;

    // adding default values for bloodGroup and phoneNumber
    public Patient(int id, String name, int birthYear, double height, double weight) {
        this(id, name, birthYear, height, weight, "Unknown", "N/A");
    }

    // New constructor with blood group and phone number
    public Patient(int id, String name, int birthYear, double height, double weight,
                   String bloodGroup, String phoneNumber) {
        this.id = (id > 0) ? id : -1;
        this.name = name;
        if (birthYear > 1900 && birthYear <= 2026)
            this.birthYear = birthYear;
        else
            this.birthYear = 2000; //default value
        this.height = (height > 0) ? height : 175.0;
        this.weight = (weight > 0) ? weight : 65.0;
        this.bloodGroup = (bloodGroup != null && !bloodGroup.isEmpty()) ? bloodGroup : "Unknown";
        this.phoneNumber = (phoneNumber != null && !phoneNumber.isEmpty()) ? phoneNumber : "N/A";
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge(int currentYear) {
        if (currentYear < birthYear) {
            return -1;
        } else
            return currentYear - birthYear;
    }

    // class to calculate BMI
    public double getBMI() {
        double heightInMeters = height / 100.0; // convert cm to m
        return weight / (heightInMeters * heightInMeters);
    }

    public String getDetails(int currentYear) {
        return "Patient Name:" + name + "\n" +
                "Patient  Age" + getAge(currentYear) + "\n" +
                "Patient Height (cm)" + height + "\n" +
                "Patient Weight (kg):" + weight + "\n" +
                "Patient Blood Group:" + bloodGroup + "\n" +
                "Patient Phone Number:" + phoneNumber + "\n" +
                String.format("Patient BMI: %.2f", getBMI());
    }
}