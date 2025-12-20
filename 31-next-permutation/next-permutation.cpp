class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int n = nums.size();
        int i, j;

        // Step 1: find first decreasing index
        for(i = n - 2; i >= 0 && nums[i] >= nums[i + 1]; i--);

        if(i >= 0) {
            // Step 2: find element just larger than nums[i]
            for(j = n - 1; nums[j] <= nums[i]; j--);
            swap(nums[i], nums[j]);
        }

        // Step 3: reverse suffix
        reverse(nums.begin() + i + 1, nums.end());
    }
};
