package main;

public class Main {

    public static void main(String[] args) {
        Term term = new Term(8,0, Day.MON);
        Lesson lesson = new Lesson(term,"Obiektowe","Polak",2);
        System.out.println("Przed zmiana lekcja wyglada tak:");
        System.out.println(lesson.toString());

        System.out.println("A po zmianie:");
        if(lesson.earlierTime()) System.out.println("Przesunieto");
        else System.out.println("Nie przesunieto");
        System.out.println("I teraz lekcja wyglada tak:");
        System.out.println(lesson.toString());


    }

}
