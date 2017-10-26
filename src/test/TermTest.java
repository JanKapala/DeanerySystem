package test;

import main.Term;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class TermTest {
    Random random = new Random();
    @Test
    public void toStringTest() throws Exception {
        Term term = new Term(0,0);

        for(int i=0;i<1000;i++)
        {
            int minutes1 = random.nextInt()%(24*60);
            int minutes2 = random.nextInt()%(24*60);
            term.hour=minutes1/60;
            term.minute=minutes1%60;
            term.duration=minutes2;
            assertEquals(minutes1/60 + ":" + minutes1%60 + " [" + minutes2 + "]",term.toString());
        }
    }

    @Test
    public void earlierThanTest() throws Exception {
        Term term1 = new Term(0,0);
        Term term2 = new Term(0,0);

        for(int i=0;i<1000;i++)
        {
            int minutes1 = random.nextInt()%(24*60);
            term1.hour=minutes1/60;
            term1.minute=minutes1%60;

            int minutes2 = random.nextInt()%(24*60);
            term2.hour=minutes2/60;
            term2.minute=minutes2%60;

            boolean cmp = minutes1 < minutes2;
            assertEquals(term1.earlierThan(term2),cmp);
        }
    }

    @Test
    public void laterThanTest() throws Exception {
        Term term1 = new Term(0,0);
        Term term2 = new Term(0,0);

        for(int i=0;i<1000;i++)
        {
            int minutes1 = random.nextInt()%(24*60);
            term1.hour=minutes1/60;
            term1.minute=minutes1%60;

            int minutes2 = random.nextInt()%(24*60);
            term2.hour=minutes2/60;
            term2.minute=minutes2%60;

            boolean cmp = minutes1 > minutes2;
            assertEquals(term1.laterThan(term2),cmp);
        }
    }

    @Test
    public void endTermTest() throws Exception {
        Term term1 = new Term(0,0);
        Term term2 = new Term(0,0);

        for(int i=0;i<1000;i++)
        {
            int minutes1 = random.nextInt()%(24*60);
            term1.hour=minutes1/60;
            term1.minute=minutes1%60;

            int minutes2 = (minutes1+random.nextInt())%(24*60);
            term2.hour=minutes2/60;
            term2.minute=minutes2%60;

            assertEquals(term1.endTerm(term2).duration,minutes2-minutes1);
        }
    }

}