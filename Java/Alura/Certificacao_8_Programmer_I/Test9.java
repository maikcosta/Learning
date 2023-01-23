package Certificacao_8_Programmer_I;

import java.time.LocalDate;
import java.time.Period;

public class Test9 {

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1984, 11, 13);
        LocalDate today = LocalDate.now();
        Period d = Period.between(birthday, today);

        //code here

        System.out.println("You are " + d.getYears() + " years, " +
                d.getMonths() + " months, and " +
                d.getDays() + " days old.");
    }
}
