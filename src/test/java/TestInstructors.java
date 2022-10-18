import oct13Homework13.Instructors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestInstructors {

    @Test
    public void testInstructorsClass() {
        //Given
        Instructors instructors = Instructors.getInstance();
        String expected1 = "Teacher1";
        String expected2 = "Teacher2";
        //Then

        //When
        String actual1 = instructors.findById(1l).getName();
        String actual2 = instructors.findById(2l).getName();
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
    }
}
