public class ArrayBinarySearch {

    public static void main(String[] args) {

        int[] _100array = new int[100];
        for (int i = 0 ; i < _100array.length ; i++) {
            _100array[i] = i;
        }

        System.out.print(arrayBinarySearch(_100array, -10));
//        System.out.print(_100array[99]);

    }

    public static int arrayBinarySearch(int[] inputArray, int searchValue) {
        int searchStart = 0;
        int searchEnd = inputArray.length;

        while (searchStart != searchEnd) {
            if (searchEnd - searchStart < 2) {
                for (int i = searchStart ; i < searchEnd ; i++) {
                    if (inputArray[i] == searchValue) {
                        return i;
                    }
                }
                return -1;
            }
            int centerIndex = (searchEnd + searchStart) / 2;
            if (searchValue == inputArray[centerIndex]) {
                return centerIndex;
            } else if (searchValue < inputArray[centerIndex]) {
                searchEnd = centerIndex;
            } else if (searchValue > inputArray[centerIndex]) {
                searchStart = centerIndex;
            }
        }
        return -1;
    }
}
