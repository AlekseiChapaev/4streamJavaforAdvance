package hw_9_2_2;

public class MonthsUtils {

    static Month January = new Month("January", 31, 19);
    static Month February = new Month("February", 28, 20);
    static Month March = new Month("March", 31, 20);
    static Month April = new Month("April", 30, 21);
    static Month May = new Month("May", 31, 20);
    static Month June = new Month("June", 30, 21);
    static Month July = new Month("July", 31, 20);
    static Month August = new Month("August", 31, 21);
    static Month September = new Month("September", 30, 20);
    static Month October = new Month("October", 31, 21);
    static Month November = new Month("November", 30, 22);
    static Month December = new Month("December", 31, 21);

    static Month[] year = new Month[]{January, February, March, April, May, June, July, August, September, October, November, December};

    static Month[] firstQuarter = new Month[]{January, February, March};
    static Month[] secondQuarter = new Month[]{April, May, June};
    static Month[] thirdQuarter = new Month[]{July, August, September};
    static Month[] fourQuarter = new Month[]{October, November, December};


}
