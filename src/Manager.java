import java.time.LocalDate;

public class Manager extends Employee{
    private float fixedSalary;

    public Manager(String firstName, String lastName, int insuranceNumber, LocalDate dateofBirth, LocalDate dateofFirstDayInCompany, float fixedSalary) {
        super(firstName, lastName, insuranceNumber, dateofBirth, dateofFirstDayInCompany);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public float calculateMonthlySalary() {
        return fixedSalary;
    }
}
