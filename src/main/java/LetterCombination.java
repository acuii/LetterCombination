import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Ting
 * @date 2020/10/28 15:08
 * @description LetterCombination
 *
 * #Problem Description
 * Given an integer array containing digits from [0, 9], the task is to print all possible letter combinations that the numbers could represent. A mapping of digit to letters (just like on the telephone buttons) is being followed. Note that 0 and 1 do not map to any letters. All the mapping are shown in the image below:
 * 0- 1- 2-ABC 3-DEF 4-GHI 5-JKL 6-MNO 7-PQRS 8-TUV 9-WXYZ
 *
 * Stage 1
 * Write a program to convert the digits from 0 to 9 into letters
 *
 * Example:
 * Input: arr[] = {2, 3}
 * Output: ad ae af bd be bf cd ce cf
 * Input: arr[] = {9}
 * Output: w x y z
 *
 * Stage 2 - new requirements
 * The program need to support converting the digits from 0 to 99 into letters
 *
 * Example:
 * Input: arr[] = {2, 33}
 * Output: add, ade, adf, aed, aee, aef, afd, afe, aff, bdd, bde, bdf, bed, bee, bef, bfd, bfe, bff, cdd, cde, cdf, ced, cee, cef, cfd, cfe, cff
 */
public class LetterCombination {

    private static final String[] DIGITS_LETTER = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombination(int[] arr) {
        List<String> result = new ArrayList<>();
        List<Integer> digits = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int size = digits.size();
        if (null != digits && size != 0) {
            for (int i = 0; i < size; i++) {
                Integer d = digits.get(i);
                if (d < 0 || d > 99) {
                    return result;
                }
                if (d > 9 && d <= 99) {
                    digits.remove(i);
                    digits.add(i,d/10);
                    digits.add(i+1,d%10);
                    size = digits.size();
                }
            }
            combine(digits,"",0, result);
        }
        return result;
    }

    private void combine(List<Integer> digits, String letter, int index, List<String> result) {
        if (index == digits.size()) {
            result.add(letter);
            return;
        }

        String letters = DIGITS_LETTER[digits.get(index)];
        if (letters.length() == 0) {
            combine(digits, letter, index + 1, result);
        }

        for (char l : letters.toCharArray()) {
            combine(digits, letter + l, index + 1, result);
        }
    }
}
