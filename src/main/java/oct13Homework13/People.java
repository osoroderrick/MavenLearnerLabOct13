package oct13Homework13;

import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person>  {
    private List<Person> personList;

    public People() {
        personList = new ArrayList<>();
    }

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        Person p1 = null;
        for(Person person : personList){
           if(person.getId() == id){
               p1 = person;
           }
        }
        return p1;
    }

    public boolean contains(Person person){
        if(personList.contains(person)){
            return true;
        }
        return false;
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void removeById(long id){
        for(Person person: personList){
            if(person.getId() == id){
                personList.remove(person);
            }
        }
    }

    public void removeAll(){
        personList.clear();
    }

    public void count(){
        System.out.println(personList.size());
    }

    public Person[] toArray(){
        Person [] personArray = new Person[personList.size()];
        for(Person person : personList){
            for(int i = 0; i < personList.size(); i++){
                personArray[i] = person;
            }
        }
        return personArray;
    }

    public int getSizeOfPersonList(){
        return personList.size();
    }


    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
