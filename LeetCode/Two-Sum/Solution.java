1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3     Map<Integer,Integer> map = new HashMap<>();
4     for(int i =0; i < nums.length; i++) {
5        int complement = target - nums[i];
6        if(map.containsKey(complement)){
7            return new int[] {map.get(complement),i};
8
9        }
10        else{
11            map.put(nums[i], i);
12        }
13     }
14     throw new IllegalArgumentException("No match");
15    }
16}