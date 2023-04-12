import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class MetodosDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDate dateLess = date.minusMonths(1);
        System.out.println("Removendo um mês: " + dateLess);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Dia da Semana: " + dayOfWeek);

        int day = date.getDayOfMonth();
        System.out.println("Dia da mês: " + day);

        Month month = date.getMonth();
        System.out.println("Mês: " + month);

    }
}
