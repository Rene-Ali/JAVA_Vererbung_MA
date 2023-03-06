import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Company company1 = new Company("RAG");

        Employee employee1 = new Employee("Ali",
                "Guenueruen",
                1500,
                LocalDate.of(1985,8,30),
                LocalDate.of(2001, 1, 12)
                );

        Employee employee2 = new Employee("Maria",
                "Guenueruen",
                1500,
                LocalDate.of(1985,8,30),
                LocalDate.of(2001, 1, 12)
        );





        company1.addEmployee(employee2);
    company1.addEmployee(employee1);

        employee1.getAge();
        System.out.println(employee1.getAge());

        employee1.getYearsinCompany();
        System.out.println(employee1.getYearsinCompany());

        employee1.calculateMonthlySalary();
        System.out.println(employee1.calculateMonthlySalary());

        employee2.calculateMonthlySalary();

        employee1.setGender('m');
        employee2.setGender('w');



        company1.ratioOfWoman();
        System.out.println(company1.ratioOfWoman());


        company1.printEmployees();

        Internal i1 = new Internal("Ali", "G", 2500, LocalDate.of(1985, 8, 30), LocalDate.of(2000, 7, 25));

        company1.addEmployee(i1);
        company1.countInternals();
        System.out.println(company1.countInternals());

        company1.calculateSalarySum();
        System.out.println(company1.calculateSalarySum());







    }
}
