import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;

public class CWH_101_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

//        String myDate = ldt.format(dtf);
        String myDate = ldt.format(df2);

        System.out.println(myDate);
    }
}
