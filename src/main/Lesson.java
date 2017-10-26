package main;

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
        return name + " (" + term.day.toString() + " " + term.hour + ":" + term.minute + "-" + (term.hour*60+term.minute+term.duration)/60 + ":" + (term.hour*60+term.minute+term.duration)%60 + ")";
    }

    public void earlierDay()
    {
        Day new_day = term.day.prevDay();
        int minutes_start=term.hour*60+term.minute;
        int minutes_stop=minutes_start+term.duration;
        if(full_time)
        {
            if(
                    (new_day==Day.MON
                            ||
                            new_day==Day.TUE
                            ||
                            new_day==Day.WED
                            ||
                            new_day==Day.THU)

                            &&

                            minutes_start>=8*60 && minutes_stop <=17*60
                    )
            {
                term.day=new_day;
            }
        }
        else
        {
            if(
                    new_day==Day.FRI

                            &&

                            minutes_start>=17*60 && minutes_stop <=20*60
                    )
            {
                term.day=new_day;
            }
        }
    }

    public void laterDay()
    {
        Day new_day = term.day.nextDay();
        int minutes_start=term.hour*60+term.minute;
        int minutes_stop=minutes_start+term.duration;
        if(full_time)
        {
            if(
                    (new_day==Day.MON
                    ||
                    new_day==Day.TUE
                    ||
                    new_day==Day.WED
                    ||
                    new_day==Day.THU)

                    &&

                    minutes_start>=8*60 && minutes_stop <=17*60
                    )
            {
                term.day=new_day;
            }
        }
        else
        {
            if(
                    new_day==Day.FRI

                    &&

                    minutes_start>=17*60 && minutes_stop <=20*60
                    )
            {
                term.day=new_day;
            }
        }
    }

    public boolean earlierTime()
    {
        int minutes_start = term.hour*60+term.minute;
        int new_start = minutes_start-term.duration;
        int new_stop = minutes_start;

        Day new_day=term.day;
        if(new_start<0)
        {
            new_start=new_start%(24*60);
            new_day=term.day.prevDay();
        }

        if(full_time)
        {
            if(
                    (new_day==Day.MON
                            ||
                            new_day==Day.TUE
                            ||
                            new_day==Day.WED
                            ||
                            new_day==Day.THU)

                            &&

                            new_start>=8*60 && new_stop <=17*60
                    )
            {
                term.day=new_day;
                term.hour=new_start/60;
                term.minute=new_start%60;
                return true;
            }
            else return false;
        }
        else
        {
            if(
                    new_day==Day.FRI

                            &&

                            new_start>=17*60 && new_stop <=20*60
                    )
            {
                term.day=new_day;
                term.hour=new_start/60;
                term.minute=new_start%60;
                return true;
            }
            else return false;
        }
    }

    public boolean laterTime()
    {
        int minutes_start = term.hour*60+term.minute;
        int new_start = minutes_start+term.duration;
        int new_stop = minutes_start;

        Day new_day=term.day;
        if(new_start>=24*60)
        {
            new_start=new_start%(24*60);
            new_day=term.day.nextDay();
        }

        if(full_time)
        {
            if(
                    (new_day==Day.MON
                            ||
                            new_day==Day.TUE
                            ||
                            new_day==Day.WED
                            ||
                            new_day==Day.THU)

                            &&

                            new_start>=8*60 && new_stop <=17*60
                    )
            {
                term.day=new_day;
                term.hour=new_start/60;
                term.minute=new_start%60;
                return true;
            }
            else return false;
        }
        else
        {
            if(
                    new_day==Day.FRI

                            &&

                            new_start>=17*60 && new_stop <=20*60
                    )
            {
                term.day=new_day;
                term.hour=new_start/60;
                term.minute=new_start%60;
                return true;
            }
            else return false;
        }
    }
}
