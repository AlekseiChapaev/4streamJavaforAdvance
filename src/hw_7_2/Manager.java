package hw_7_2;

public class Manager extends Employee{

    private int numbersOfSubordinates;

    public Manager(String name, int salaryPerDay, int numbersOfSubordinates) {
        super(name, salaryPerDay);
        this.numbersOfSubordinates = numbersOfSubordinates;
    }

    @Override
    public int getSalary(Month[] monthArray) {
        return super.getSalary(monthArray) + super.getSalary(monthArray) * numbersOfSubordinates / 100 ;
    }
}
