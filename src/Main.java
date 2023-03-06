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

        Internal i1 = new Internal("Ali", "Gustav", 2500, LocalDate.of(1985, 8, 30), LocalDate.of(2000, 7, 25));

        company1.addEmployee(i1);
        company1.countInternals();
        System.out.println(company1.countInternals());

        company1.calculateSalarySum();
        System.out.println(company1.calculateSalarySum());

        company1.countEmployeesOlderThan(25);
        System.out.println(company1.countEmployeesOlderThan(40));

        company1.calculateAvgSalary();
        System.out.println(company1.calculateAvgSalary());

        Manager m1 = new Manager("Gustav", "Dackelmann", 4000, LocalDate.of(1985, 8, 30), LocalDate.of(2000, 7, 25), 20000);
        company1.addEmployee(m1);

        company1.topEarner();
        System.out.println(company1.topEarner());





    }
}
