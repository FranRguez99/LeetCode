import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Calculate the complement of the current number
            if (numMap.containsKey(complement)) { // If the complement is present in the map
                return new int[] { numMap.get(complement), i }; // Return the indices of the two numbers that add up to the target
            }
            numMap.put(nums[i], i); // Add the current number to the map with its index
        }

        return new int[] { -1, -1 }; // Return [-1, -1] if no pair is found
    }
}
