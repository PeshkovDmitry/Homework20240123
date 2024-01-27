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
    }
}