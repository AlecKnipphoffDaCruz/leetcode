package leetcode.RemoveElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int x = 0;
        for (int num : nums) {
            if (num != val) {
                nums[x] = num;
                x++;
            }
        }
        return x;
    }
}
