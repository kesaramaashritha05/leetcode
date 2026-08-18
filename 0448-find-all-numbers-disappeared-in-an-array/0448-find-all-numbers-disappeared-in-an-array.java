class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);
        for (int i = 1; i < nums[0]; i++) {
            result.add(i);
        }
        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] - nums[i] > 1) {
                for (int j = nums[i] + 1; j < nums[i + 1]; j++) {
                    result.add(j);
                }
            }
        }
        for (int i = nums[n - 1] + 1; i <= n; i++) {
            result.add(i);
        }

        return result;
    }
}