package hw_9_2_1_another_response.hw_9_2_1;

public abstract class Employee {

    private int baseSalary = 10000;
    private String name;
    private int salary;

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getSalary();
}
