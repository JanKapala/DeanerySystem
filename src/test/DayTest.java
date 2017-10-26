package test;

import main.Day;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DayTest {

    @Test
    public void nextDayTest() throws Exception{
        assertEquals(Day.MON,Day.SUN.nextDay());
        assertEquals(Day.TUE,Day.MON.nextDay());
        assertEquals(Day.WED,Day.TUE.nextDay());
        assertEquals(Day.THU,Day.WED.nextDay());
        assertEquals(Day.FRI,Day.THU.nextDay());
        assertEquals(Day.SAT,Day.FRI.nextDay());
        assertEquals(Day.SUN,Day.SAT.nextDay());
    }

    @Test
    public void prevDayTest() throws Exception{
        assertEquals(Day.SAT,Day.SUN.prevDay());
        assertEquals(Day.SUN,Day.MON.prevDay());
        assertEquals(Day.MON,Day.TUE.prevDay());
        assertEquals(Day.TUE,Day.WED.prevDay());
        assertEquals(Day.WED,Day.THU.prevDay());
        assertEquals(Day.THU,Day.FRI.prevDay());
        assertEquals(Day.FRI,Day.SAT.prevDay());
    }
}
