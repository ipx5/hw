package hw3.student;

public class Aspirant extends Student {

    private final boolean scienceWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = true;
    }

    @Override
    public int getScholarship() {
        if (this.getAverageMark() == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
