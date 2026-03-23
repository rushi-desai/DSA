class Solution {
    public int maxFrequencyElements(int[] nums) {

        //  find max element
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        //: create freq array
        int[] freq = new int[max + 1];

        // fill frequency
        for(int i = 0; i < nums.length; i++){
            freq[nums[i]]++;
        }

        //  find max frequency
        int maxFreq = 0;
        for(int f : freq){
            if(f > maxFreq){
                maxFreq = f;
            }
        }

        //  sum frequencies equal to max
        int total = 0;
        for(int f : freq){
            if(f == maxFreq){
                total += f;
            }
        }

        return total;
    }
}