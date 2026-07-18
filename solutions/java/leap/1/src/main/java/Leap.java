import java.time.LocalDate;
import java.time.Month;

class Leap {

    boolean isLeapYear(int year) {
    // Start at February 1st of the given year
        LocalDate date = LocalDate.of(year, Month.FEBRUARY, 1);
    
    // Add 28 days
        LocalDate result = date.plusDays(28);
    
    // Check if it is still February (February 29th)
        return result.getMonth() == Month.FEBRUARY;
    }
}
