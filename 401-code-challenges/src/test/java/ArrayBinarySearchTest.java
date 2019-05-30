import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayBinarySearchTest {
    @Test
    public void testArrayBinarySearch_100() {

        ArrayBinarySearch arrayBinarySearchForTesting = new ArrayBinarySearch();

        int[] _100array = new int[100];
        for (int i = 0 ; i < _100array.length ; i++) {
            _100array[i] = i;
        }

        assertEquals("The function should find the number 34 at index 34.",
                34,
                arrayBinarySearchForTesting.arrayBinarySearch(_100array, 34));
    }

    @Test
    public void testArrayBinarySearch_10_000() {
        ArrayBinarySearch arrayBinarySearchForTesting = new ArrayBinarySearch();

        int[] _10000array = new int[10000];
        for (int i = 0 ; i < _10000array.length ; i++) {
            _10000array[i] = i;
        }

        assertEquals("The function should find the number 9876 at index 9876",
                9876,
                arrayBinarySearchForTesting.arrayBinarySearch(_10000array, 9876));
    }

    @Test
    public void testArrayBinarySearch_1_000_000() {
        ArrayBinarySearch arrayBinarySearchForTesting = new ArrayBinarySearch();

        int[] _1000000array = new int[1000000];
        for (int i = 0 ; i < _1000000array.length ; i++) {
            _1000000array[i] = i;
        }

        assertEquals("The function should find the number 794721 at index 794721",
                794721,
                arrayBinarySearchForTesting.arrayBinarySearch(_1000000array, 794721));
    }

    @Test
    public void testArrayBinarySearch_noMatch() {
        ArrayBinarySearch arrayBinarySearchForTesting = new ArrayBinarySearch();

        int[] _1000000array = new int[1000000];
        for (int i = 0 ; i < _1000000array.length ; i++) {
            _1000000array[i] = i;
        }

        assertEquals("The function should fail to find the number 1,000,000, and return a -1.",
                -1,
                arrayBinarySearchForTesting.arrayBinarySearch(_1000000array, 1000000));
    }


}