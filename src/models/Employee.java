package models;

public class Employee extends Person {

    private String level;
    private String position;
    private double salary;

    public Employee(int id, String name, int birthDay, String gender, long idCard, long phoneNumber, String email, String level, String position, double salary) {
        super(id, name, birthDay, gender, idCard, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String level, String position, double salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(int id, String name, int birthDay, String gender, long idCard, long phoneNumber, String email) {
        super(id, name, birthDay, gender, idCard, phoneNumber, email);
    }

    public Employee() {
    }

    public String getLevel() {
        return level;
    }

    public String getGender() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "" +super.toString() +
        "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                +
                '}';
    }
}
