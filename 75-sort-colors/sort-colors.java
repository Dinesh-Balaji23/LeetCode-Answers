class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) low++;
            if(nums[i] == 1) mid++;
            if(nums[i] == 2) high++;
        }
        int i;
        for(i = 0; i < low; i++) nums[i] = 0;
        for(; i < low + mid; i++) nums[i] = 1;
        for(; i < low + mid + high; i++) nums[i] = 2;
    }
}
