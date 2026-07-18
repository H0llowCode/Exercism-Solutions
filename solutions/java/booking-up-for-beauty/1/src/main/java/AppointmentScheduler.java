import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Month;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
    // Defines the exact pattern used in your test string
    DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    return LocalDateTime.parse(appointmentDateDescription, parser);
}


    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter printer = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        DateTimeFormatter printer2 = DateTimeFormatter.ofPattern("h:mm a");
        return "You have an appointment on " + appointmentDate.format(printer) + ", at " + appointmentDate.format(printer2) + ".";
    }

    public LocalDate getAnniversaryDate() {
        LocalDateTime date = LocalDateTime.now();
        return LocalDate.of(date.getYear(), Month.SEPTEMBER, 15);
    }
}
