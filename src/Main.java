import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(
                "Иван",
                "Иванов",
                "Рабочий",
                "123",
                45000,
                2000);
        Employee e2 = new Employee(
                "Сидор",
                "Сидоров",
                "Рабочий",
                "456",
                55000,
                1991);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e1.compareTo(e2));

        Manager m = new Manager(
                "Петр",
                "Петров",
                "Начальник",
                "789",
                70000,
                1980);
        m.addEmployee(e1);
        m.addEmployee(e2);
        System.out.println(m);

        Manager.increaseSalary(Arrays.asList(new Employee[] {e1, e2, m}), 10000);
        System.out.println(m);

    }
}