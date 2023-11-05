class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] a = new int[nums.length];
        Arrays.fill(a, 1);
        for(int i = nums.length-1; i >= 0; i--) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] < nums[j]) {
                    a[i] = Math.max(a[i], 1+a[j]);
                }
            }
        }
        return Arrays.stream(a).max().getAsInt();
    }
}
