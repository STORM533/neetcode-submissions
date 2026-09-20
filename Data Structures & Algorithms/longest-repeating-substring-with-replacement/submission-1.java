class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int length = 0;
        int maxFreq = 0;
        int[] count = new int[26];
        while (right < s.length()) {
            count[s.charAt(right) - 'A']++;
            if (count[s.charAt(right) - 'A'] > maxFreq) {
                maxFreq = count[s.charAt(right) - 'A'];
            }
            if ((right + 1 - left) - maxFreq <= k) {
                length = Math.max(length, right - left + 1);

            } else {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            right++;

        }
        return length;
    }
}
