package hw_7_1;

public class Employee {

    //final private int BASE_SALARY = 10000;

    private String name;
    private String surname;
    private int salary;
    private int baseSalary;

    public int getBaseSalary() {
        return baseSalary;
    }


    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getSurname() {
        return surname;
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee() {
    }
}

