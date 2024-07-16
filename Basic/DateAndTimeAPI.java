import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateAndTimeAPI{

    public static void main(String[] args) {

        //**DATE CLASS **
        
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365); //years till now
        System.out.println(Long.MAX_VALUE);
        // this is depricated class ..java has date and time API
        Date d = new Date(); // object of date class (contains bith date and time)
        //d.setTime(11);
        System.out.println(d);



        //**CALENDAR CLASS **

        GregorianCalendar gc= new GregorianCalendar();
        System.out.println(gc.isLeapYear(2020)); // leap year or not
        System.out.println(gc.get(Calendar.DATE)); // today's date

        TimeZone t =gc.getTimeZone();// we cannot create the object of timezone 
        System.out.println(t);
        System.out.println(t.getDisplayName());
    }
}