class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int min = nums[0], max = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > max) max = nums[i];
            if(nums[i] < min) min = nums[i];
        }
        for(int i = min; i <= max; i++) {
            int val = i;
            int found = 0;
            for(int j = 0; j < nums.length; j++) if(nums[j] == i) { found = 1; break; }
            if(found == 0) res.add(i);
        }
        Collections.sort(res);
        return res;
    }
}