import org.junit.Test;

import static org.junit.Assert.*;


public class ArrayShiftTest {
    @Test
    public void testArrayShift_evenArray() {
        ArrayShift arrayShiftForTesting = new ArrayShift();

        int[] startArr = new int[] {1,2,4,5};

        assertArrayEquals("Using function on an even length array should put new value into new center index.",
                new int[] {1,2,3,4,5}, // expected value
                arrayShiftForTesting.arrayShift(startArr, 3) // actual value
        );
    }

    @Test
    public void testArrayShift_oddArray() {
        ArrayShift arrayShiftForTesting = new ArrayShift();

        int[] startArr = new int[] {1,2,3,5,6};

        assertArrayEquals("Using function on an odd length array should put new value into index to the right of center.",
                new int[] {1,2,3,4,5,6}, // expected value
                arrayShiftForTesting.arrayShift(startArr, 4) // actual value
        );
    }

    @Test
    public void testArrayShift_emptyArray() {
        ArrayShift arrayShiftForTesting = new ArrayShift();

        int[] startArr = new int[0];

        assertArrayEquals("Using function on an empty array should put return the new value as the only element of array.",
                new int[]{1}, // expected value
                arrayShiftForTesting.arrayShift(startArr, 1) // actual value
        );
    }

}