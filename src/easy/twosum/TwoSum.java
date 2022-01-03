package easy.twosum;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int[] rsl = {0, 0};

        for (int x = 0; x < nums.length; x++) {
            for (int y = x + 1; y <= nums.length - 1; y++) {
                if (target == nums[y] + nums[x]) {
                    rsl[0] = x;
                    rsl[1] = y;
                }
            }
        }

        return rsl;
    }
}