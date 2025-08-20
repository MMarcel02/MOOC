import java.util.ArrayList;

public class ExerciseManagement {
    private ArrayList<String> list;

    public ExerciseManagement() {
        list = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        return list;
    }

    public void add(String exercise) {
        list.add(exercise);
    }
}
