import java.util.ArrayList;

public class Room {
    ArrayList<Person> peopleInRoom;

    public Room() {
        peopleInRoom = new ArrayList<>();
    }

    public void add(Person person) {
        peopleInRoom.add(person);
    }

    public boolean isEmpty() {
        return peopleInRoom.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return peopleInRoom;
    }

    public Person shortest() {
        if (peopleInRoom.isEmpty()) {
            return null;
        }

        Person shortest = peopleInRoom.get(0);
        for (Person person : peopleInRoom) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }

    public Person take() {
        if (peopleInRoom.isEmpty()) {
            return null;
        }
        Person shortest = shortest();
        peopleInRoom.remove(shortest);
        return shortest;
    }
}
