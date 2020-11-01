import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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
        int[] digits = {2,3};
        System.out.println("Input:" + Arrays.toString(digits));
        List<String> result = letterCombination.letterCombination(digits);
        System.out.println("Output:" + result.toString());

        int[] digits1 = {35,99};
        System.out.println("Input:" + Arrays.toString(digits1));
        List<String> result1 = letterCombination.letterCombination(digits1);
        System.out.println("Output:" + result1.toString());

        int[] digits2 = {0,34,6};
        System.out.println("Input:" + Arrays.toString(digits2));
        List<String> result2 = letterCombination.letterCombination(digits2);
        System.out.println("Output:" + result2.toString());

        int[] digits3 = {120,89};
        System.out.println("Input:" + Arrays.toString(digits3));
        List<String> result3 = letterCombination.letterCombination(digits3);
        System.out.println("Output:" + result3.toString());

        int[] digits4 = {-1,9};
        System.out.println("Input:" + Arrays.toString(digits4));
        List<String> result4 = letterCombination.letterCombination(digits4);
        System.out.println("Output:" + result4.toString());
    }
}