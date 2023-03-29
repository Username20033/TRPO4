import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @org.junit.jupiter.api.Test
    void testRadixsort() {
        int array[] = {1, 0, 5, 11, 2, 10};
        Main.radixsort(array);
        int expected[] = {0, 1, 2, 5, 10, 11};
        assertArrayEquals(expected, array);
    }

    @org.junit.jupiter.api.Test
    void testRadixsort1() {
        int array[] = {1, 2, 3, 4, 5};
        Main.radixsort(array);
        int expected[] = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, array);
    }

    @org.junit.jupiter.api.Test
    void testRadixsort2() {
        int array[] = {1, 1, 3, 3, 2, 5};
        Main.radixsort(array);
        int expected[] = {1, 1, 2, 3, 3, 5};
        assertArrayEquals(expected, array);
    }

    @org.junit.jupiter.api.Test
    void testRadixsort3() {
        int array[] = {0, 0, 0, 0};
        Main.radixsort(array);
        int expected[] = {0, 0, 0, 0};
        assertArrayEquals(expected, array);
    }

    @org.junit.jupiter.api.Test
    void testRadixsort4() {
        int array[] = {1, 0};
        Main.radixsort(array);
        int expected[] = {0, 1};
        assertArrayEquals(expected, array);
    }

    @org.junit.jupiter.api.Test
    void testRadixsort5() {
        int array[] = {0};
        Main.radixsort(array);
        int expected[] = {0};
        assertArrayEquals(expected, array);
    }
}