package hw_7_1;

public class Manager extends Employee{

    private int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public Manager(String name, String surname, int numberOfSubordinates) {
        super(name, surname);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getSalary(){
        return getBaseSalary() + getBaseSalary() * numberOfSubordinates / 100 * 3;
    }
}
