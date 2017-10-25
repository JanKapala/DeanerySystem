package lab2;

public enum Day {
    MON, TUE, WED, THU, FRI, SAT, SUN;

    public String toString(){
        switch(this){
            case MON: return "Monday";
            case TUE: return "Thuesday";
            case WED: return "Wednesday";
            case THU: return "Thursday";
            case FRI: return "Friday";
            case SAT: return "Saturday";
            case SUN: return "Sunday";
            default: return "Monday";
        }
    }

    public Day nextDay()
    {
        switch(this){
            case MON: return TUE;
            case TUE: return WED;
            case WED: return THU;
            case THU: return FRI;
            case FRI: return SAT;
            case SAT: return SUN;
            case SUN: return MON;
            default: return MON;
        }
    }

    public Day prevDay()
    {
        switch(this){
            case MON: return SUN;
            case TUE: return MON;
            case WED: return TUE;
            case THU: return WED;
            case FRI: return THU;
            case SAT: return FRI;
            case SUN: return SAT;
            default: return MON;
        }
    }
}
