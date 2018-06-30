package ir.piana.util.persiandate;

import org.junit.Test;

import static org.junit.Assert.*;

public class PianaJalaliCalendarTest {
    @Test
    public void test1() {
        PianaJalaliCalendar date1 = new PianaJalaliCalendar(1390, 1, 1);
        PianaJalaliCalendar date2 = new PianaJalaliCalendar(1397, 1, 1);
        assertEquals("difference of two time is incorrect",
                220924800000l,
                date2.getTimeInMillis() - date1.getTimeInMillis());
    }
}
