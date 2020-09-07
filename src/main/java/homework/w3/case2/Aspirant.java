package homework.w3.case2;

public class Aspirant extends Student {
    private String scienceWork;

    public Aspirant(double averageMark, String scienceWork) {
        super(averageMark);
        this.scienceWork = scienceWork;
    }

    public String getScienceWork() {
        return scienceWork;
    }

    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    @Override
    protected double getScholarShip() {
        if(averageMark == 5.0D) {
            return 200;
        }
        return 180;
    }
}
