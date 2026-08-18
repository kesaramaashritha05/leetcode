class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] count = new int[nums.length + 1];

      
        for (int num : nums) {
            count[num]++;
        }

     
        for (int i = 1; i <= nums.length; i++) {
            if (count[i] == 2) {
                result.add(i);
            }
        }

        return result;
    }
}