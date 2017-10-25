package lab2;

public class Main {

    public static void main(String[] args) {
        Term term = new Term(8,50, Day.MON);
        Lesson lesson = new Lesson(term,"Programowanie obiektowe", "Stanisław Polak", 2);

        System.out.println(lesson.toString());
    }

}
