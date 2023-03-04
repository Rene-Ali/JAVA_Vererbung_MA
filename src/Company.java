import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Employee> employees;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void addEmployee(String firstName, String lastName, int insuranceNumber){
        employees.add(new Employee(firstName, lastName, insuranceNumber));
    }

    public int employeeCount(){
        return employees.size();
    }

    public void removeEmployees(int index){
        if (index >=0 && index < employees.size() ){
            employees.remove(index);
        }
    }

    public void printEmployee(int index){
        if (index >=0 && index < employees.size() ){
            Employee employee = employees.get(index);
            employee.print();
        }
    }

    public void printEmployees(){
        System.out.println("Mitarbeiter des Unternehmens" + name);
        for (Employee employee:employees){
            employee.print();
        }
    }
}
