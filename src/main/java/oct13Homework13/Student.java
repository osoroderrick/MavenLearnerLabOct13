package oct13Homework13;

public class Student extends Person implements Learner{
    private double totalStudyTime;

    public Student(Long id, String name,double totalStudyTime) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;

    }


    public void setTotalStudyTime(double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
