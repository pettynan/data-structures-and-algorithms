package sort;

public class QuickSort {

    public int[] quickSort(int[] array, int left, int right) {
        if (left < right) {
            int position = partition(array, left, right);

            quickSort(array, left, position - 1);

            quickSort(array, position + 1, right);
        }

        return array;
    }


    private int partition(int[] array, int left, int right) {
        int pivot = array[right];

        int low = left - 1;

        for (int i = left ; i < right ; i++) {
            if (array[i] <= pivot) {
                low++;
                swap(array, i, low);
            }
        }
        swap(array, right, low + 1);

        return low + 1;
    }

    private void swap(int[] array, int i, int low) {
        int temp;
        temp = array[i];
        array[i] = array[low];
        array[low] = temp;
    }
}
