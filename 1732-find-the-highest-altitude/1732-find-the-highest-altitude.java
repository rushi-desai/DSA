class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int current = 0;

        for (int i = 0; i < gain.length; i++) {
            current += gain[i];
            maxAltitude = Math.max(maxAltitude, current);
        }

        return maxAltitude;
    }
}