class Solution {
    public int removeDuplicates(int[] nums) {
        int min = nums[0];
        int filled = 1;
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            if (current == 999) return filled;
            if (current <= min) {
                nums[i] = 999;
            } else {
                min = current;
                swap(nums, i, filled);
                filled++;
            }
        }
        return filled;
    }
    
    public void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}