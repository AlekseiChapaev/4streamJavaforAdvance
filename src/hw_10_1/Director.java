package hw_10_1;

public class Director extends Manager {

    public Director(String name, int baseSalary, int numbersOfSubordinates) {
        super(name, baseSalary, numbersOfSubordinates);
    }

    @Override
    public int getSalary() {
        return super.getSalary() + super.getSalary() * numbersOfSubordinates / 100 * 6;
    }
}
