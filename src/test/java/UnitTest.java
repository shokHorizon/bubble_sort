import org.example.BubbleSorter;
import org.junit.*;

import static org.junit.Assert.assertArrayEquals;

public class UnitTest {
    @Test
    public void ArbitraryArrTest() {
        int[] actual = {10,228,1337,1,5};
        BubbleSorter.sort(actual);
        int[] expected = {1,5,10,228,1337};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void NegativeNumArrTest() {
        int[] actual = {-5,5,10,-10};
        BubbleSorter.sort(actual);
        int[] expected = {-10,-5,5,10};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void SameNumArrTest(){
        int[] actual = {1,1,1,1,2,1};
        BubbleSorter.sort(actual);
        int[] expected = {1,1,1,1,1,2};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void SortedArrTest(){
        int[] actual = {-1,2,3,4,5};
        BubbleSorter.sort(actual);
        int[] expected = {-1,2,3,4,5};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void EmptyArrTest() {
        int[] actual = {};
        BubbleSorter.sort(actual);
        int[] expected = {};
        assertArrayEquals(expected, actual);
    }
}
