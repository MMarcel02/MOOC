import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {10, 2, 5, 11, 1};

        System.out.println(Arrays.toString(numbers));
        MainProgram.sort(numbers);

    }
    
    public static int smallest(int[] arrayOfInts) {
        int smallestValue = arrayOfInts[0];
        for (int value : arrayOfInts) {
            if (value < smallestValue) {
                smallestValue = value;
            }
        }
        return smallestValue;
    }

    public static int indexOfSmallest(int[] arrayOfInts) {
        int smallestValueIndex = 0;
        for (int i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] < arrayOfInts[smallestValueIndex]) {
                smallestValueIndex = i;
            }
        }

        return smallestValueIndex;
    }

    public static int indexOfSmallestFrom(int[] arrayOfInts, int startIndex) {
        int smallestValueIndex = startIndex;
        for (int i = startIndex; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] < arrayOfInts[smallestValueIndex]) {
                smallestValueIndex = i;
            }
        }

        return smallestValueIndex;
    }

    public static void swap(int[] arrayOfInts, int indexOfFirst, int indexOfSecond) {
        int temp = arrayOfInts[indexOfFirst];
        arrayOfInts[indexOfFirst] = arrayOfInts[indexOfSecond];
        arrayOfInts[indexOfSecond] = temp;
    }

    public static void sort(int[] arrayOfInts) {
        for (int i = 0; i < arrayOfInts.length; i++) {
            int indexOfSmallest = indexOfSmallestFrom(arrayOfInts, i);
            swap(arrayOfInts, i, indexOfSmallest);
            System.out.println(Arrays.toString(arrayOfInts));
        }
    }


}
