import java.time.LocalDate;

public class Agent extends Employee{
    private float baseSalary;
    private float salesVolume;

    public Agent(String firstName, String lastName, int insuranceNumber, LocalDate dateofBirth, LocalDate dateofFirstDayInCompany, float baseSalary, float salesVolume) {
        super(firstName, lastName, insuranceNumber, dateofBirth, dateofFirstDayInCompany);
        this.baseSalary = baseSalary;
        this.salesVolume = salesVolume;
    }

    @Override
    public float calculateMonthlySalary() {
        float bonus = (float) ((salesVolume*1.5)/100);
        return baseSalary + bonus;
    }

    @Override
    public String toString() {
        return "AGENT: "+ getLastName() +
                "-" + getGender()+":"+
                "baseSalary=" + baseSalary +
                ", salesVolume=" + salesVolume;
    }
}
