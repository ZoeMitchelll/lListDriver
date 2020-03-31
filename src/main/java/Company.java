import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employees;
    private String companyName;

    public Company(String companyName) {
        this.companyName = companyName;
    }
    public void addEmployee(Employee e){
        employees.add(e);
    }
}
