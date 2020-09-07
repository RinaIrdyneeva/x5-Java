package homework.w3.case2;

public class Student {
    protected String firtName;
    protected String lastname;
    protected String group;
    protected double averageMark;

    public Student(double averageMark) {
        this.averageMark = averageMark;
    }

    protected double getScholarShip() {
        if (averageMark == 5.0D) {
            return 100;
        }
        return 80;
    }

    public static void main(String[] args) {
        Student aspirant = new Aspirant(4, "Law");
        Student[] studentsAndAspirants = {
                new Student(4),
                new Aspirant(4, "biology"),
                new Student(5),
                new Aspirant(5, "geografic"),
                new Student(3),
                new Aspirant(3, "psychology")
        };

        for (Student element: studentsAndAspirants) {
            System.out.println("ScholarShip: " + element.getScholarShip());
        }

    }
}
