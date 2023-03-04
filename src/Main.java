public class Main {
    public static void Main(String[] args){
        Company company = new Company ("Ali G.");

        Employee employee = new Employee ("Rene", "Günürün", 1111);

        company.addEmployee(employee);

        company.printEmployee(employee);

    }
}
