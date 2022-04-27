package hw_7_2;

public class MonthUtils {

   // enum ArrayMonth{January, February, March, April, May, June, July, August, September, October, November, December}

        final private Month[] ARRAY_MONTHS = {
                new Month("January", 31, 19),
                new Month("February", 28, 20),
                new Month("March", 31, 20),
                new Month("April", 30, 21),
                new Month("May", 31, 20),
                new Month("June", 30, 21),
                new Month("July", 31, 20),
                new Month("August", 31, 21),
                new Month("September", 30, 20),
                new Month("October", 31, 21),
                new Month("November", 30, 22),
                new Month("December", 31, 21)
        };

        public Month[] getARRAY_MONTHS() {
                return ARRAY_MONTHS;
        }

        public String getMonth(Month[] array, String month){
                String monthInArray = "";
                for (int i = 0; i < array.length; i++) {
                        if(month.equals(array[i].getMonth())){
                                monthInArray = "In month " + array[i].getMonth() + " count of days is "
                                        + array[i].getCountDays() + " and count of work days is " + array[i].getCountWorkDays();
                        }
                }
                return monthInArray;
        }
}


