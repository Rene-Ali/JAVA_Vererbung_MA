public class Employee {
    private String firstName;
    private String lastName;
    private char gender;
    private int insuranceNumber;
    private LocalDate dateofBirth;
    private LocalDate dateofFirstDayIncompany;

    public Employee(String firstName, String lastName, char gender, int insuranceNumber, LocalDate dateofBirth, LocalDate dateofFirstDayIncompany) {
        this.firstName = firstName;
        this.lastName = lastName;
        setGender(Gender);
        setInsuranceNumber(insuranceNumber);
        this.dateofBirth = dateofBirth;
        this.dateofFirstDayIncompany = dateofFirstDayIncompany;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'm' || gender == 'w' || gender = 'd'){
            this.gender = gender;
        } else {
            this.gender = '-';
        }
    }

    public int getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(int insuranceNumber) {
        if (insuranceNumber.length() <1000 || insuranceNumber.length() > 9999){
            System.out.println("InsuranceNumber" + insuranceNumber + "nicht gültig. Die InsuranceNumber muss größer 1000 & kleiner 9999 sein.");
            this.insuranceNumber = "Ungültig";
        }
        else {this.insuranceNumber = insuranceNumber;
    }

    public LocalDate getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(LocalDate dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public LocalDate getDateofFirstDayIncompany() {
        return dateofFirstDayIncompany;
    }

    public void setDateofFirstDayIncompany(LocalDate dateofFirstDayIncompany) {
        this.dateofFirstDayIncompany = dateofFirstDayIncompany;
    }
}
