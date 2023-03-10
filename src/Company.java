import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Company {
    private String name;
    private ArrayList<Employee> employees;


    public Company(String name) {

        this.name = name;
        employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addEmployee(String firstName, String lastName, int insuranceNumber, LocalDate dateofBirth, LocalDate dateofFirstDayInCompany) {
        employees.add(new Employee(firstName, lastName, insuranceNumber, dateofBirth, dateofFirstDayInCompany));

    }

    public int employeeCount() {
        return employees.size();
    }

    public void removeEmployees(int index) {
        if (index >= 0 && index < employees.size()) {
            employees.remove(index);
        }
    }

    public void removeEmployee(String lastName) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getLastName().equals(lastName)) {
                iterator.remove();
            }
        }
    }

    public void printEmployee(int index) {
        if (index >= 0 && index < employees.size()) {
            Employee employee = employees.get(index);
            employee.print();
        }
    }

    public void printEmployees() {
        System.out.println("Mitarbeiter des Unternehmens" + name);
        for (Employee employee : employees) {
            employee.print();
        }
    }

    public float ratioOfWoman() {
        int zaehleFrauen = 0;
        for (Employee employee : employees) {
            if (employee.getGender() == 'w') {
                zaehleFrauen++;
            }
        }
        int ganzeBelegschaft = employees.size();
        float ratio = ((float) zaehleFrauen / ganzeBelegschaft) * 100;
        return ratio;

    }

    public int countInternals() {
        int zaehleInternals = 0;
        for (Employee employee : employees) {
            if (employee instanceof Internal) {
                zaehleInternals++;
            }
        }
        return zaehleInternals;
    }

    public double calculateSalarySum(){
        double summeAllerGeh??lter = 0;
        for(Employee employee:employees){
            summeAllerGeh??lter+=employee.calculateMonthlySalary();
        }
        return summeAllerGeh??lter;
    }
    public int countEmployeesOlderThan(int age){
        int anzahlMA = 0;
        for (Employee employee:employees){
            if (employee.getAge() > age){
                anzahlMA++;
            }
        }
        return anzahlMA;
    }

    public double calculateAvgSalary(){
        double summeAllerGeh??lter = 0;
        for(Employee employee:employees){
            summeAllerGeh??lter+=employee.calculateMonthlySalary();
        }
        return summeAllerGeh??lter/employeeCount();
    }

    public String topEarner(){
        String topEarnerName = "";
        double maxSalary = 0;
        for(Employee employee:employees){
            if(employee.calculateMonthlySalary() > maxSalary){
                maxSalary = employee.calculateMonthlySalary();
                topEarnerName = employee.getLastName();
            }
        }
        return "The employee "+ topEarnerName;
    }

    // ab Top Earner Gehalt bis increase manager Salary

}
