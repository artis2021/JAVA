import java.util.Calendar;
import java.util.GregorianCalendar;

public class CWH_98_Calender {
    public static void main(String[] args) {
//        Calendar c = new Calendar() {
//            @Override
//            protected void computeTime() {
//
//            }
//
//            @Override
//            protected void computeFields() {
//
//            }
//
//            @Override
//            public void add(int field, int amount) {
//
//            }
//
//            @Override
//            public void roll(int field, boolean up) {
//
//            }
//
//            @Override
//            public int getMinimum(int field) {
//                return 0;
//            }
//
//            @Override
//            public int getMaximum(int field) {
//                return 0;
//            }
//
//            @Override
//            public int getGreatestMinimum(int field) {
//                return 0;
//            }
//
//            @Override
//            public int getLeastMaximum(int field) {
//                return 0;
//            }
//        }

        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());
//        System.out.println(c.getTime());
//        System.out.println(c.get(Calendar.DATE));
//        System.out.println(c.get(Calendar.SECOND));
//        System.out.println(c.get(Calendar.MINUTE));
//        System.out.println(c.get(Calendar.HOUR));
//        System.out.println(c.get(Calendar.HOUR_OF_DAY));
//        System.out.println(c.get(Calendar.HOUR_OF_DAY)+ " "+ c.get(Calendar.MINUTE));

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2001));


    }
}
