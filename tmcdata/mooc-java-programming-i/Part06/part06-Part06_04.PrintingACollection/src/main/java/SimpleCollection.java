
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + name + " is empty.";
        } else if (elements.size() == 1) {
            String baseText = "The collection " + name + " has 1 element:\n";
            return baseText + elements.get(0);
        } else {
            String baseText = "The collection " + name + " has " + elements.size() + " elements:\n";
            String outputElements = "";
            for (String element : elements) {
                outputElements = outputElements + element + "\n";
            }
            return baseText + outputElements;
        }

    }
}
