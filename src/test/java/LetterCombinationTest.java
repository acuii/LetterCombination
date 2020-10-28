import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LetterCombinationTest {

    private LetterCombination letterCombination = new LetterCombination();

    @Before
    public void setUp() throws Exception {
        System.out.println("test start");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("test end");
    }

    @Test
    public void letterCombinations() {
        int[] digits = {0,34,6};
        System.out.println("Input:" + Arrays.toString(digits));
        List<String> result = letterCombination.letterCombination(digits);
        System.out.println("Output:" + result.toString());
    }
}