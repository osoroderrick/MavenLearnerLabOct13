import oct13Homework13.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        //Given
        Instructor instructor = new Instructor(123l,"Teacher1");
        //When
        //Then
        Assertions.assertTrue(instructor instanceof Teacher);

    }

    @Test
    public void testInheritance(){
        //Given
        Instructor instructor = new Instructor(123l,"Teacher1");
        //When
        //Then
        Assertions.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        //Given
        Instructor instructor = new Instructor(123l,"Teacher1");
        Student student = new Student(85l,"Student1",11);
        Double expected = 20.00;
        //When
        instructor.teach(student,9);
        //Then
        Double actual = student.getTotalStudyTime();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testLecture(){
        //Given
        Instructor instructor = new Instructor(123l,"Teacher1");
        Learner [] learners = {new Student(12l,"John",10),new Student(13l,"Jacob",20),new Student(14l,"Larry",30)};
        Double expected = 14.00;
        //When
        instructor.lecture(learners,12);
        //Then
        Double actual = learners[0].getTotalStudyTime();
        Assertions.assertEquals(expected,actual);
    }



}
