import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] arrayStrings = {"abc", "bac", "cba", "aabc", "0ab"};

        ArrayList<Integer> listIntegers = new ArrayList<>(Arrays.asList(3, 1, 5, 99, 3, 12));
        ArrayList<String> listStrings = new ArrayList<>(Arrays.asList("abc", "bac", "cba", "aabc", "0ab"));



        //To sort arrays you can just use the Arrays utility
        Arrays.sort(array);
        Arrays.sort(arrayStrings);

        //To sort Lists you need to use Collections in built utility
        Collections.sort(listIntegers);
        Collections.sort(listStrings);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayStrings));
        System.out.println(listIntegers);
        System.out.println(listStrings);


    }

}
