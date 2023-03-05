import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Company company1 = new Company("RAG");

        Employee employee1 = new Employee("Ali",
                "Guenueruen",
                1500,
                LocalDate.of(1985,8,30),
                LocalDate.of(2001, 1, 12)
                );

        employee1.getAge();
        System.out.println(employee1.getAge());

        employee1.getYearsinCompany();
        System.out.println(employee1.getYearsinCompany());

        employee1.calculateMonthlySalary();
        System.out.println(employee1.calculateMonthlySalary());

        Internal i1 = new Internal("Rene", "RAG", 2000, LocalDate.of(1985, 8, 30), LocalDate.of(2000, 1, 1));

        i1.calculateMonthlySalary();
        System.out.println(i1.calculateMonthlySalary());







    }
}
