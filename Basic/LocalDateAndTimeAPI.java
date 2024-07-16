import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;


public class LocalDateAndTimeAPI {
    public static void main(String[] args) {
        
        //LocalDate ld =LocalDate.now(ZoneId.of("Asia/Kolkata")); 
        //LocalDate ld = LocalDate.of(2020, 10, 29); // will display a/c to "of" method
        LocalDate ld = LocalDate.ofEpochDay(10); // will display date after 10 days of epochday
        System.out.println(ld);// print today's date

        ZonedDateTime zdt = ZonedDateTime.now(); // date and time with zone
        System.out.println(zdt);

        Period p= Period.ofYears(10);
        System.out.println(p);
        
    }
}
