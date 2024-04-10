import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Date_time {
    public static void main(String[] args) {
        LocalDate nowdt = LocalDate.now();
	System.out.println(nowdt);
	LocalTime nowti = LocalTime.now();
	System.out.println(nowti);
	LocalDateTime nowdtti = LocalDateTime.now();
	System.out.println(nowdtti);
	LocalDateTime  nowdtti1 = LocalDateTime.of(nowdt, nowti);
	System.out.println(nowdtti1);
	LocalDate LD1 = LocalDate.of(2025, 3, 19);
	System.out.println(LD1.parse("2025-03-19"));
	System.out.println(LD1.getDayOfWeek());
	System.out.println(LD1.withMonth(6));
    LocalDate ld2 = LD1.plusYears(1);
    System.out.println(ld2);
    ld2 = ld2.plusDays(2);
    System.out.println(ld2);
    System.out.println(ld2.equals(LD1));
    System.out.println(ld2.minusDays(10));
    LocalDateTime ldt3 = ld2.atTime(8, 20, 12);
    System.out.println(ldt3);
    System.out.println("=============================");
    LocalDateTime flightTimeDate = LocalDateTime.of(2024, 4, 12, 7, 20, 33);
    System.out.println(flightTimeDate);
    ZonedDateTime zdt = flightTimeDate.atZone(ZoneId.of("Asia/Kolkata"));
    System.out.println(zdt); 
    ZonedDateTime zdt1 = zdt.withZoneSameInstant(ZoneId.of("Asia/Kolkata")).plusHours(1).plusMinutes(20);
    System.out.println(zdt1);
    System.out.println(zdt.plusDays(1).plusHours(1).plusMinutes(10).plusMonths(2).plusYears(1).minusDays(1));
    System.out.println(zdt.getDayOfMonth()); 
    System.out.println("===============PERIOD CALCULATION======================");
    LocalDate spp = LocalDate.of(2024, 04, 10);
    LocalDate epp = LocalDate.of(2025, 04, 10);
    Period totalp = Period.between(spp, epp);
    System.out.println("Total Period"+" "+totalp);
    System.out.println("Year"+" "+totalp.getYears());
    System.out.println("months"+" "+totalp.getMonths());
    System.out.println("days"+" "+totalp.getDays());
    System.out.println("==============Duration Calculation:=====================");
    LocalTime st = LocalTime.of(1, 20, 54);
    LocalTime et = LocalTime.of(2, 30, 23);
    Duration howlongs = Duration.between(st, et);
    System.out.println(howlongs);
}

}
