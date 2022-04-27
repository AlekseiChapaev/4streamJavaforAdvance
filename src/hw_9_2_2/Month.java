package hw_9_2_2;

public final class Month {

    private String monthName;
    private int numbersOfDays;
    private int numbersOfWorkDays;

    public Month(String monthName, int numbersOfDays, int numbersOfWorkDays) {
        this.monthName = monthName;
        this.numbersOfDays = numbersOfDays;
        this.numbersOfWorkDays = numbersOfWorkDays;
    }

    public Month() {
    }

    public int getNumbersOfWorkDays() {
        return numbersOfWorkDays;
    }
}
