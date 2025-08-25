import java.util.ArrayList;

public class BirdList {
    private ArrayList<Bird> birds;

    public BirdList() {
        this.birds = new ArrayList<>();
    }

    public void addBird(String name, String latinName) {
        Bird newBird = new Bird(name, latinName);
        birds.add(newBird);
    }

    public ArrayList<Bird> getBirds() {
        return birds;
    }
}
