import oct13Homework13.People;
import oct13Homework13.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {
    @Test
    public void testAdd(){
        //Given
        Person person1 = new Person(1l,"Carl");
        Person person2 = new Person(2l,"Malone");
        People people = new People();
        people.add(person1);
        people.add(person2);
        Integer expected = 3;

        //When
        people.add(new Person(3l,"Michael Scott"));
        //Then
        Integer actual = people.getSizeOfPersonList();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testRemove(){
        //Given
        Person person1 = new Person(1l,"Carl");
        Person person2 = new Person(2l,"Malone");
        People people = new People();
        people.add(person1);
        people.add(person2);
        Integer expected = 1;

        //When
        people.remove(person2);
        //Then
        Integer actual = people.getSizeOfPersonList();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testFindById(){
        //Given
        Person person1 = new Person(1l,"Carl");
        Person person2 = new Person(2l,"Malone");
        People people = new People();
        people.add(person1);
        people.add(person2);
        String expected = "Carl";

        //When
        people.findById(1l);
        //Then
        String actual = people.findById(1l).getName();
        Assertions.assertEquals(expected,actual);
    }
}
