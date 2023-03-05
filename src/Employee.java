import java.lang.String;
import java.time.LocalDate;
import java.time.Period;


public class Employee {
    private String firstName;
    private String lastName;
    private char gender;
    private int insuranceNumber;
    private LocalDate dateofBirth;
    private LocalDate dateofFirstDayInCompany;

    public Employee(String firstName, String lastName, int insuranceNumber, LocalDate dateofBirth, LocalDate dateofFirstDayInCompany) {
        this.firstName = firstName;
        this.lastName = lastName;
        setGender(gender);
        setInsuranceNumber(insuranceNumber);
        this.dateofBirth = dateofBirth;
        this.dateofFirstDayInCompany = dateofFirstDayInCompany;
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
        if (!(gender == 'm' || gender == 'w' || gender == 'd')) {
            this.gender = '-';
        } else {
            this.gender = gender;
        }
    }


    public void setInsuranceNumber(int insuranceNumber) {
        if (insuranceNumber < 1000 || insuranceNumber > 9999) {
            System.out.println("InsuranceNumber" + insuranceNumber + "nicht gültig. Die InsuranceNumber muss größer 1000 & kleiner 9999 sein.");
        } else {
            this.insuranceNumber = insuranceNumber;
        }
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", insuranceNumber=" + insuranceNumber +
                '}';
    }

    public LocalDate getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(LocalDate dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public LocalDate getDateofFirstDayInCompany() {
        return dateofFirstDayInCompany;
    }

    public void setDateofFirstDayInCompany(LocalDate dateofFirstDayInCompany) {
        this.dateofFirstDayInCompany = dateofFirstDayInCompany;
    }

    public int getAge(){
        LocalDate today = LocalDate.now();
        LocalDate birthday = getDateofBirth();

        Period p = Period.between(birthday, today);
        return p.getYears();
    }

    public int getYearsinCompany(){
        LocalDate today = LocalDate.now();
        LocalDate jubiläum = getDateofFirstDayInCompany();

        Period p1 = Period.between(jubiläum, today);
        return p1.getYears();
    }
    public float calculateMonthlySalary(){
        return 1000;
    }

}


