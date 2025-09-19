class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int max = 0;
      int currentCount = 0;
        
        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                max = Math.max(max, currentCount);
            } else {
                currentCount = 0;
            }
        }
        
        return max;
    }
}
