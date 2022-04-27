package hw_9_2_1;

public class Worker extends Employee {

    public int getSalary() {
        return getBaseSalary();
    }

    @Override
    public final int getBaseSalary() {
        return super.getBaseSalary();
    }
}
