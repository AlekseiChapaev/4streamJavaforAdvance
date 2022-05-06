package hw_10_1;

public class Manager extends Worker{

    int numbersOfSubordinates;

    public Manager(String name, int baseSalary, int numbersOfSubordinates) {
        super(name, baseSalary);
        this.numbersOfSubordinates = numbersOfSubordinates;
    }

    public int getNumbersOfSubordinates() {
        return numbersOfSubordinates;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + super.getSalary() * numbersOfSubordinates / 100 * 3;
    }
}
