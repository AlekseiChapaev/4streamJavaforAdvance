package hw_9_2;

public class Worker extends Employee {

    @Override
    public int getSalary() {
        return getBaseSalary();
    }
}
