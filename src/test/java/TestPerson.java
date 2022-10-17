import oct13Homework13.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPerson {



    @Test
    public void testConstructor(){
        //Given
        String expectedName = "Charlie";
        Long expectedId = 222l;
        //When
        Person person = new Person(222l,"Charlie");
        //Then
        String actualName = person.getName();
        Long actualId = person.getId();
        Assertions.assertEquals(expectedName,actualName);
        Assertions.assertEquals(expectedId,expectedId);
    }

    @Test
    public void setNameTest(){
        //Given
        Person person = new Person(33l,"Curtis Jackson");
        String expected = "Curtis Jackson";
        //When
        person.setName(expected);
        String actual = person.getName();
        //Then
        Assertions.assertEquals(expected,actual);
    }


}
