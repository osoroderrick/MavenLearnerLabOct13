import oct13Homework13.Learner;
import oct13Homework13.Person;
import oct13Homework13.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        //Given
        Student student = new Student(85l,"Student1",12);
        //When

        //Then
        Assertions.assertTrue(student instanceof Learner);

    }

    @Test
    public void testInheritance(){
        //Given
        Student student = new Student(85l,"Student1",13);
        //When

        //Then
        Assertions.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        //Given
        Student student = new Student(85l,"Student1",14);
        Double expected = 30.00;
        //When
        student.learn(16);
        //Then
        Double actual = student.getTotalStudyTime();
        Assertions.assertEquals(expected,actual);

    }





}
