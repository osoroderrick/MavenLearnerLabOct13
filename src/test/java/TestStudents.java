import oct13Homework13.Students;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStudents {

    @Test
    public void testStudentsClass(){
        //Given
        Students students = Students.getInstance();
        String expected1 = "Durran";
        String expected2 = "Emilia";
        String expected3 = "Henry";
        String expected4 = "Isaiah";
        //When

        //Then
        String actual1 = students.findById(111).getName();
        String actual2 = students.findById(112).getName();
        String actual3 = students.findById(113).getName();
        String actual4 = students.findById(114).getName();
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
        Assertions.assertEquals(expected3,actual3);
        Assertions.assertEquals(expected4,actual4);
    }
}
