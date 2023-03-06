import java.time.LocalDate;

public class Freelancer extends Employee{
    private float hourlyRate;
    private int hours;

    public Freelancer(String firstName, String lastName, int insuranceNumber, LocalDate dateofBirth, LocalDate dateofFirstDayInCompany, float hourlyRate, int hours) {
        super(firstName, lastName, insuranceNumber, dateofBirth, dateofFirstDayInCompany);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public float calculateMonthlySalary() {
        float bonusAmount = (hours /100)*100;
        return (hours*hourlyRate)+bonusAmount;
    }

    @Override
    public String toString() {
        return "Freelancer{" +
                "hourlyRate=" + hourlyRate +
                ", hours=" + hours +
                '}';
    }
}
