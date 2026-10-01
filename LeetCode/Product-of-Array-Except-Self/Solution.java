1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] answer = new int[n];
5        int prefix = 1;
6        for(int i = 0; i<n; i++){
7            answer[i] = prefix;
8            prefix = prefix * nums[i];
9        }
10            int suffix = 1;
11            for (int i = n-1; i >= 0; i--) {
12                answer[i] = answer[i] * suffix;
13                suffix = suffix * nums[i];
14
15            }
16            return answer;
17
18
19            
20        
21
22      
23    }
24}