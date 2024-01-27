import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{

    private List<Employee> employees;

    public Manager(String name, String surname, String position, String phoneNumber, int salary, int birthYear) {
        super(name, surname, position, phoneNumber, salary, birthYear);
        employees = new ArrayList();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public Employee getEmployeeById(int id) {
        return employees.get(id);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString())
                .append("\n\rПодчиненные:\n\r");
        for (Employee e: employees) {
            stringBuilder.append(e.toString()).append("\n\r");
        }
        return stringBuilder.toString();
    }

    public static void increaseSalary(List<Employee> list, int inc) {
        for (Employee e: list) {
            if (!(e instanceof Manager)) {
                e.setSalary(e.getSalary() + inc);
            }
        }
    }

}
