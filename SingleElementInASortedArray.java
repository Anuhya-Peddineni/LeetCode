class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        while(l <= r) {
            int m = l+(r-l)/2;
            int leftSize;
            if ((m-1 < 0 || nums[m] != nums[m-1]) && (m+1 == nums.length || nums[m] != nums[m+1])) {
                return nums[m];
            }
            else if(nums[m] == nums[m-1]) {
                leftSize = m-1;
            }
            else {
                leftSize = m;
            }
            if(leftSize % 2 == 0) {
                l = m+1;
            }
            else {
                r=m-1;
            }
        }
        return -1;
    }
}
