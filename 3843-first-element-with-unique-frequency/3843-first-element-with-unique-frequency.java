class Solution {
    public int firstUniqueFreq(int[] nums) {
       HashMap<Integer, Integer> count = new HashMap<>();

        for (int n : nums)
            count.put(n, count.getOrDefault(n, 0) + 1);

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int f : count.values())
            freq.put(f, freq.getOrDefault(f, 0) + 1);

        for (int n : nums) {
            if (freq.get(count.get(n)) == 1)
                return n;
        }

        return -1; 
    }
}