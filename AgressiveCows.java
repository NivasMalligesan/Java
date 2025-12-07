class Solution {

    public boolean valid(int[] nums, int distance, int cows) {
        int countCows = 1;  // place first cow at first stall
        int last = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - last >= distance) {  
                countCows++;
                last = nums[i];
            }
            if (countCows >= cows) return true;
        }
        return false;
    }

    public int aggressiveCows(int[] nums, int cows) {
        Arrays.sort(nums);

        int min = 1;
        int max = nums[nums.length - 1] - nums[0];
        int ans = 0;

        while (min <= max) {
            int mid = min + (max - min) / 2;

            if (valid(nums, mid, cows)) {
                ans = mid;
                min = mid + 1;  
            } else {
                max = mid - 1;
            }
        }
        return ans;
    }
}
