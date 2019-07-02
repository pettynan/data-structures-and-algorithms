package sort;

import java.util.Arrays;

public class MergeSort {


    public int[] mergeSort(int[] array) {
        int n = array.length;

        if (n > 1) {
            int mid = n / 2;
            int[] b = Arrays.copyOfRange(array, 0, mid);
            int[] c = Arrays.copyOfRange(array, mid, n);

            mergeSort(b);

            mergeSort(c);

            merge(b, c, array);
        }
        return array;
    }

    private int[] merge(int[] b, int[] c, int[] a) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < b.length && j < c.length) {
            if (b[i] <= c[j]) {
                a[k] = b[i];
                i++;
            } else {
                a[k] = c[j];
                j++;
            }
            k++;
        }

        if (i == b.length) {
            while (j < c.length) {
                a[k] = c[j];
                j++;
                k++;
            }
        } else {
            while (i < b.length) {
                a[k] = b[i];
                i++;
                k++;
            }
        }
        return a;
    }
}
