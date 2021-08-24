
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nick Woi
 */
public class Room {

    private ArrayList<Person> classRoom;

    public Room() {
        this.classRoom = new ArrayList<>();
    }

    public void add(Person person) {
        this.classRoom.add(person);
    }

    public boolean isEmpty() {
        return this.classRoom.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.classRoom;
    }

    public Person shortest() {
        if (this.classRoom.isEmpty()) {
            return null;
        }

        Person shorty = this.classRoom.get(0);

        for (Person person : this.classRoom) {
            if (shorty.getHeight() > person.getHeight()) {
                shorty = person;
            }
        }
        return shorty;
    }

    public Person take() {
        Person shorty = this.shortest();
        this.classRoom.remove(shorty);
        return shorty;

    }

}
