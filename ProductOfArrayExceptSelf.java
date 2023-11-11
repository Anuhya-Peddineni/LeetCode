class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre=1;
        int post=1;
        int output[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = pre;
            pre=pre*nums[i];
        }
        for (int i = nums.length-1; i >= 0; i--) {
            output[i] = output[i]*post;
            post=post*nums[i];
        }
        return output;
    }
}
