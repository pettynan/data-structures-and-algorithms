package sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {

    MergeSort init = new MergeSort();

    @Test
    public void testMergeSort() {
            int[] array = {4, 1, 3, 6, 8, 2};
            String expectedOutput = "[1, 2, 3, 4, 6, 8]";


            System.out.println(Arrays.toString(init.mergeSort(array)));
            assertEquals("a",
                    expectedOutput,
                    Arrays.toString(init.mergeSort(array)));
    }
}