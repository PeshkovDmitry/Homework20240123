public class Employee {

    private static final int CURRENT_YEAR = 2024;

    private String name;

    private String surname;

    private String position;

    private String phoneNumber;

    private int salary;

    private int birthYear;

    public Employee(String name, String surname, String position, String phoneNumber, int salary, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return CURRENT_YEAR - birthYear;
    }

    @Override
    public String toString() {
        return "Сотрудник:\n\r" +
                "Имя: " + name + "\n\r" +
                "Фамилия: " + surname + "\n\r" +
                "Возраст: " + this.getAge() + "\n\r" +
                "Должность: " + position + "\n\r" +
                "Телефон: " + phoneNumber + "\n\r" +
                "Зарплата: " + salary;
    }
}
