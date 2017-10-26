package main;

public class Term {
    public int hour;
    public int minute;
    public int duration;
    public Day day;

    public Term(int hour, int minute) {
        this.hour=hour;
        this.minute=minute;
        this.duration=90;
    }

    public Term(int hour, int minute, Day day) {
        this.hour=hour;
        this.minute=minute;
        this.duration=90;
        this.day=day;
    }

    public String toString(){
        return hour + ":" + minute + " [" + duration + "]";
    }

    public Boolean earlierThan(Term term){
        if(this.hour < term.hour) return true;
        if(this.hour > term.hour) return false;
        return this.minute < term.minute;
    }

    public Boolean laterThan(Term term) {
        if(this.hour > term.hour) return true;
        if(this.hour < term.hour) return false;
        return this.minute > term.minute;
    }

    public Term endTerm(Term term) {
        Term the_new = new Term(term.hour,term.minute);
        the_new.duration = (term.hour-this.hour)*60 + term.minute-this.minute;
        return the_new;
    }

    public Term endTerm() {
        int minutes = this.hour*60+this.minute+this.duration;
        Term the_new = new Term(minutes/60, minutes%60);
        the_new.duration=this.duration;
        return the_new;
    }

    public Boolean equals(Term term) {
        if(this.hour==term.hour && this.minute==term.minute && this.duration==term.duration) return true;
        return false;
    }


}
