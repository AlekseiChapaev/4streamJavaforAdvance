package hw_9_2_2_another_response.hw_9_2_2;

public class MonthsUtils {

    private static final Month JANUARY = new Month("January", 31, 19);
    private static final Month FEBRUARY = new Month("February", 28, 20);
    private static final Month MARCH = new Month("March", 31, 20);
    private static final Month APRIL = new Month("April", 30, 21);
    private static final Month MAY = new Month("May", 31, 20);
    private static final Month JUNE = new Month("June", 30, 21);
    private static final Month JULY = new Month("July", 31, 20);
    private static final Month AUGUST = new Month("August", 31, 21);
    private static final Month SEPTEMBER = new Month("September", 30, 20);
    private static final Month OCTOBER = new Month("October", 31, 21);
    private static final Month NOVEMBER = new Month("November", 30, 22);
    private static final Month DECEMBER = new Month("December", 31, 21);

    private static final Month[] YEAR = new Month[]{JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};

    private static final Month[] FIRSTQUARTER = new Month[]{JANUARY, FEBRUARY, MARCH};
    private static final Month[] SECONDQUARTER = new Month[]{APRIL, MAY, JUNE};
    private static final Month[] THIRDQUARTER = new Month[]{JULY, AUGUST, SEPTEMBER};
    private static final Month[] FOURQUARTER = new Month[]{OCTOBER, NOVEMBER, DECEMBER};

    public static Month[] getYEAR(){
        return YEAR;
    }

    public static Month getMonth(int index){
        return YEAR[index];
    }
}
