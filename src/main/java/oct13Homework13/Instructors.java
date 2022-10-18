package oct13Homework13;

public class Instructors extends People{

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
       Instructor instructor1 = new Instructor(1l,"Teacher1");
       Instructor instructor2 = new Instructor(2l,"Teacher2");

       add(instructor1);
       add(instructor2);
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
}
