package hw_7_1;

public class Director extends Manager {

    public Director(String name, String surname, int numberOfSubordinates) {
        super(name, surname, numberOfSubordinates);
    }

    public int getSalary() {
        return getBaseSalary() + getBaseSalary() * getNumberOfSubordinates() / 100 * 9;
    }
}
