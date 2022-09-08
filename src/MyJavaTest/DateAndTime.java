package MyJavaTest;

import org.testng.annotations.Test;

import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class DateAndTime {

    @Test
    public void testDate(){
        Date date1 = new Date(2020-1900, Calendar.SEPTEMBER,8);
        System.out.println(date1);
    }

    @Test
    public void test1(){
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2020,10,30,13,25,39);
        System.out.println(localDateTime1);

        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getMonthValue());

        LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println(localDate1);

        LocalDateTime localDateTime2 = localDateTime.plusMonths(3);
        System.out.println(localDateTime2);

        LocalDateTime localDateTime4 = localDateTime.minusDays(6);
        System.out.println(localDateTime);
        System.out.println(localDateTime4);

    }
    @Test
    public void test2(){
        Instant instant = Instant.now();
        System.out.println(instant);

        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

        long milli = instant.toEpochMilli();
        System.out.println(milli);
    }
}
