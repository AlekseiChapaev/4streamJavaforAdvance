package hw_9_2;

public class Worker extends Employee {

    public int getSalary() {
        return getBaseSalary();
    }

    @Override
    public final int getBaseSalary() {
        return super.getBaseSalary();
    }
}
