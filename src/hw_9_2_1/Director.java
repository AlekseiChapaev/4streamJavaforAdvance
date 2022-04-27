package hw_9_2_1;

public final class Director extends Worker{

    private int numberOfSubordinates;
    private static final int INDEX = 9;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getSalary() {
        return super.getSalary() + super.getSalary() * numberOfSubordinates / 100 * INDEX;
    }
}
