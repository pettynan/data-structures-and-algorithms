package sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickSortTest {

    QuickSort init = new QuickSort();

    @Test
    public void quickSort() {
        int[] array = {4, 1, 3, 6, 8, 2};
        String expectedOutput = "[1, 2, 3, 4, 6, 8]";


        System.out.println(Arrays.toString(init.quickSort(array, 0, array.length - 1)));
        assertEquals("a",
                expectedOutput,
                Arrays.toString(init.quickSort(array, 0, array.length - 1)));
    }
}