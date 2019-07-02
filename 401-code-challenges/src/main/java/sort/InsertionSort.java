package sort;

public class InsertionSort {

    public int[] insertionSort(int[] array) {
        int j;
        int temp;

        for (int i = 1 ; i < array.length ; i++) {
            j = i - 1;
            temp = array[i];

            while (j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }
        return array;
    }
}
