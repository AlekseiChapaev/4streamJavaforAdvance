package hw_9_2;

public class Manager extends Worker{

    private int NumberOfSubordinates;

    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        NumberOfSubordinates = numberOfSubordinates;
    }

    public int getSalary() {
        return getBaseSalary() + getBaseSalary() /100 * 3;
    }
}
