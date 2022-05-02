package hw_9_2_1_another_response.hw_9_2_1;

public abstract class BaseManager extends Worker {

    private int numberOfSubordinates;
    private static final int INDEX = 3;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public abstract int getIndex();

    @Override
    public int getSalary() {
        return super.getSalary() + super.getSalary() * numberOfSubordinates / 100 * getIndex();
    }
}
