import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : arr) {
            frequency.put(
                num,
                frequency.getOrDefault(num, 0) + 1
            );
        }

        Set<Integer> seen = new HashSet<>();

        for (int count : frequency.values()) {
            if (!seen.add(count)) {
                return false;
            }
        }

        return true;
    }
}
