package hw_7_2;

public class Month {

    private String month;
    private int countDays;
    private int countWorkDays;

    public Month(String month, int countDays, int countWorkDays) {
        this.month = month;
        this.countDays = countDays;
        this.countWorkDays = countWorkDays;
    }

    public String getMonth() {
        return month;
    }

    public int getCountDays() {
        return countDays;
    }

    public int getCountWorkDays() {
        return countWorkDays;
    }
}
