import java.time.LocalDate;

public class Internal extends Employee {
    public Internal(String firstName, String lastName, int insuranceNumber, LocalDate dateofBirth, LocalDate dateofFirstDayInCompany) {
        super(firstName, lastName, insuranceNumber, dateofBirth, dateofFirstDayInCompany);
    }

    @Override
    public String toString() {
        return "Internal{}";
    }

    @Override
    public float calculateMonthlySalary() {
        return 1500 + (getYearsinCompany() *50);
    }
}
