import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stringStack;

    public Stack() {
        this.stringStack = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (this.stringStack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String value) {
        stringStack.add(value);
    }

    public ArrayList<String> values() {
        return stringStack;
    }

    public String take() {
        String lastIndex = stringStack.get(stringStack.size() - 1);
        stringStack.remove(stringStack.size() - 1);
        return lastIndex;
    }
}
