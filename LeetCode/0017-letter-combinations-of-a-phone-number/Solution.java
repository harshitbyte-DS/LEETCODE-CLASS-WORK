import java.util.ArrayList;
import java.util.List;

class Solution {

    private final String[] keypad = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return result;
        }

        backtrack(digits, 0, new StringBuilder(), result);

        return result;
    }

    private void backtrack(
        String digits,
        int index,
        StringBuilder current,
        List<String> result
    ) {

        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        int digit = digits.charAt(index) - '0';
        String letters = keypad[digit];

        for (int i = 0; i < letters.length(); i++) {
            // Choose a letter
            current.append(letters.charAt(i));

            // Process the next digit
            backtrack(digits, index + 1, current, result);

            // Remove the letter and try another choice
            current.deleteCharAt(current.length() - 1);
        }
    }
}