package hw_9_2;

public final class Manager extends Worker{

    private int numberOfSubordinates;
    private static final int INDEX = 3;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + super.getSalary() * numberOfSubordinates / 100 * INDEX;
    }
}
