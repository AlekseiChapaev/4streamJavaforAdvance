package hw_9_2;

public class Director extends Manager{

    @Override
    public int getSalary() {
        return getBaseSalary() + getBaseSalary() / 100  * 9 ;
    }
}
