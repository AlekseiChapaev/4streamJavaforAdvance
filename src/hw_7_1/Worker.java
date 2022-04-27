package hw_7_1;

public class Worker extends Employee{


    public Worker(String name, String surname) {
        super(name, surname);
    }

    public int getSalary() {
        return getBaseSalary();
    }
}
