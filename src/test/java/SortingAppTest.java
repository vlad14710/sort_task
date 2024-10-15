import org.example.SortingApp;
import org.junit.Test;
import static org.junit.Assert.*;

public class SortingAppTest {

    @Test
    public void testSorting() {
        int[] input = {5, 3, 8, 1, 2};
        int[] expected = {1, 2, 3, 5, 8};
        assertArrayEquals(expected, SortingApp.sort(input));
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, SortingApp.sort(input));
    }

    @Test
    public void testSingleElement() {
        int[] input = {1};
        int[] expected = {1};
        assertArrayEquals(expected, SortingApp.sort(input));
    }
}
