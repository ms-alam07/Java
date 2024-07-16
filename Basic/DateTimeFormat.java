import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateTimeFormat {
    
    public static void main(String[] args) {
        LocalDateTime l = LocalDateTime.now();
        System.out.println(l);
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss z Z");
        System.out.println(dtf.format(zdt));
    }
}
