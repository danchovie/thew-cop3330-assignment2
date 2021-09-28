package ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValueFilterTest {

    @Test
    void convertToIntArr() {
        char arr[] = {'1', ' ', '2', ' ','3', ' ','4', ' ','5', ' ', '6', ' ','7', ' ','8'};
        int arr2[] = {1,2,3,4,5,6,7,8};
        int len = ValueFilter.lengthChar(arr);
        assertArrayEquals(arr2, ValueFilter.convertToIntArr(arr, len));
    }

    @Test
    void lengthEven() {
        int arr[] = {1,2,3,4,5,6,7,8};
        assertEquals(4, ValueFilter.lengthEven(arr));
    }

    @Test
    void filterEvenNumbers() {
    }

    @Test
    void lengthChar() {
        char arr[] = {'1', ' ', '2', ' ','3', ' ','4', ' ','5', ' ', '6', ' ','7', ' ','8'};
        assertEquals(8, ValueFilter.lengthChar(arr));
    }
}