import org.example.SortingApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class SortingAppTest {

    private int[] input;
    private int[] expected;

    public SortingAppTest(int[] input, int[] expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{5, 3, 8, 1, 2}, new int[]{1, 2, 3, 5, 8}},
                {new int[]{}, new int[]{}} ,
                {new int[]{1}, new int[]{1}}
        });
    }

    @Test
    public void testSorting() {
        assertArrayEquals(expected, SortingApp.sort(input));
    }
}
