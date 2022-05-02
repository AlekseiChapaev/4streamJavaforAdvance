package hw_9_2_1_another_response.hw_9_2_1;

public class Worker extends Employee {

    @Override
    public int getSalary() {
        return getBaseSalary();
    }

    @Override
    public final int getBaseSalary() {
        return super.getBaseSalary();
    }
}
