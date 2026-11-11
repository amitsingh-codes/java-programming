import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room(){
        this.persons = new ArrayList<>();
    }

    public void add(Person person){
        this.persons.add(person);
    }

    public boolean isEmpty(){
        if (this.persons.isEmpty()) {
            return true;
        }

        return false;
    }

    public ArrayList<Person> getPersons(){

        return this.persons;
    }

    public Person shortest(){
        if (this.persons.isEmpty()) {
            return null;
        }

        Person shPerson = this.persons.get(0);

        for (Person person : this.persons) {
            if (person.getHeight() < shPerson.getHeight()) {
                shPerson = person;
            }
        }

        return shPerson;
    }

    public Person take(){
        Person shrPerson_remove = this.shortest();
        this.persons.remove(shortest());
        return shrPerson_remove;
    }
}
