import java.lang.String;

public class Employee {
    private String firstName;
    private String lastName;
    private char gender;
    private int insuranceNumber;
   // private LocalDate dateofBirth;
    //private LocalDate dateofFirstDayIncompany;

    public Employee(String firstName, String lastName, int insuranceNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        setGender(gender);
        setInsuranceNumber(insuranceNumber);
      //  this.dateofBirth = dateofBirth;
       // this.dateofFirstDayIncompany = dateofFirstDayIncompany;
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
        if (insuranceNumber< 1000 || insuranceNumber > 9999) {
            System.out.println("InsuranceNumber" + insuranceNumber + "nicht gültig. Die InsuranceNumber muss größer 1000 & kleiner 9999 sein.");
        } else {
            this.insuranceNumber = insuranceNumber;
        }
    }

    public void print(){
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
//public LocalDate getDateofBirth() {
        //return dateofBirth;
   // }

   // public void setDateofBirth(LocalDate dateofBirth) {
     //   this.dateofBirth = dateofBirth;
  //  }

    //public LocalDate getDateofFirstDayIncompany() {
    //    return dateofFirstDayIncompany;
   // }

   // public void setDateofFirstDayIncompany(LocalDate dateofFirstDayIncompany) {
    //    this.dateofFirstDayIncompany = dateofFirstDayIncompany;
    //}
}


