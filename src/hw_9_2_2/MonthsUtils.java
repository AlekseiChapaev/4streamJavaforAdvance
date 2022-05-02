package hw_9_2_2;

public class MonthsUtils {

    final static Month January = new Month("January", 31, 19);
    final static Month February = new Month("February", 28, 20);
    final static Month March = new Month("March", 31, 20);
    final static Month April = new Month("April", 30, 21);
    final static Month May = new Month("May", 31, 20);
    final static Month June = new Month("June", 30, 21);
    final static Month July = new Month("July", 31, 20);
    final static Month August = new Month("August", 31, 21);
    final static Month September = new Month("September", 30, 20);
    final static Month October = new Month("October", 31, 21);
    final static Month November = new Month("November", 30, 22);
    final static Month December = new Month("December", 31, 21);

    final static Month[] year = new Month[]{January, February, March, April, May, June, July, August, September, October, November, December};

    final static Month[] firstQuarter = new Month[]{January, February, March};
    final static Month[] secondQuarter = new Month[]{April, May, June};
    final static Month[] thirdQuarter = new Month[]{July, August, September};
    final static Month[] fourQuarter = new Month[]{October, November, December};
}
