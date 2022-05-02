package hw_9_2_2_another_response.hw_9_2_2;

public final class Manager extends BaseEmployee {

    private int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary(Month[] monthArray) {
        return super.getSalary(monthArray) + super.getSalary(monthArray) / 100 ;
    }

    @Override
    public int getSalary(Month month) {
        return super.getSalary(month) + super.getSalary(month) / 100;
    }
}
