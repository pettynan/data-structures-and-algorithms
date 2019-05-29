import java.util.Arrays;

public class ArrayShift {

    public static void main (String[] args) {

        int[] startArr = new int[0];

        System.out.println(Arrays.toString(arrayShift(startArr, 6)));

    }

    public static int[] arrayShift(int[] inputArray , int value) {
        int[] outputArray = new int [inputArray.length + 1];
        int insertIndex = (int) Math.ceil((float) inputArray.length / 2);

        System.out.println(insertIndex);

        for (int i = 0 ; i < insertIndex ; i++) {
            outputArray[i] = inputArray[i];
        }
        outputArray[insertIndex] = value;

        for (int i = insertIndex ; i < inputArray.length ; i++) {
            outputArray[i + 1] = inputArray[i];
        }

        return outputArray;
    }

}
