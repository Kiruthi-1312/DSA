// Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most one element.

// We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2).

/**************

Example 1:

Input: nums = [4,2,3]
Output: true
Explanation: You could modify the first 4 to 1 to get a non-decreasing array.

Example 2:

Input: nums = [4,2,1]
Output: false
Explanation: You can't get a non-decreasing array by modify at most one element.

*****************/

class Solution {
    public boolean checkPossibility(int[] nums) {
        for (int i = 1, count = 0; i < nums.length; i++)
            if (nums[i] < nums[i-1])
            {
//                If we iterate through the nums array (N), count the number of instances in which an element is lower than the one preceeding (err),
//               and then see that count go above 1, then we should be able to return false. 
                if (count++ > 0 || (i > 1 && i < nums.length - 1 && nums[i-2] > nums[i] && nums[i+1] < nums[i-1]))
                    return false;
            }
        return true;
    }
}
