package hw3.student;

public class Main {

    public static void main(String[] args) {

        Student[] students = new Student[]{
                new Student("Austin", "Wolf", "CS50", 4.12),
                new Aspirant("Elias", "Lange", "CS50", 4.98),
                new Student("Tim", "Kruger", "CS50", 4.05),
                new Student("Johnny", "Rapid", "CS50", 3.95),
                new Aspirant("Elias", "Lange", "CS50", 5)
        };

        for (Student student : students) {
            System.out.println(student.toString() + ", scholarship = " + student.getScholarship());
        }
    }
}
