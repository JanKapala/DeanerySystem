package lab2;

public class Lesson {
    Term term;
    String name;
    String teacherName;
    int year;
    boolean full_time;

    public Lesson(Term term, String name, String teacherName, int year)
    {
        this.term=term;
        this.name=name;
        this.teacherName=teacherName;
        this.year=year;
        if(this.term.day == Day.SUN
                ||
                this.term.day==Day.SAT
                ||
                this.term.day==Day.FRI)
        {
            this.full_time=false;
        }
        else this.full_time=true;
    }

    public String toString()
    {
        return name + " (" + term.day.toString() + " " + term.hour + ":" + term.minute + "-" + (term.hour+term.duration/60) + ":" + (term.minute+term.duration%60) + ")";
    }

    public void earlierDay()
    {
        term.day.prevDay();
        if(full_time)
        {
            if(     (term.day==Day.MON
                    ||
                    term.day==Day.TUE
                    ||
                    term.day==Day.WED
                    ||
                    term.day==Day.THU)

                    &&

                    ((term.hour >= 8
                    &&
                     term.hour <= 19)
                    ||
                    (term.hour == 20
                    &&
                    term.minute==0))
            ) return;
            else term.day.nextDay();
        }
    }

    public void laterDay()
    {
        term.day.nextDay();
    }
}
