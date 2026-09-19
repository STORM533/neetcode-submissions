class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();
        int left = 0;
        int right = 0;
        int length = 0;
        while (right < s.length()) {
            
            if(s.length() == 1) {
                return 1;
            }
            if (st.contains(s.charAt(right))) {
                st.remove(s.charAt(left));
                left++;
            } else {
                st.add(s.charAt(right));
                if (right - left  + 1> length) {
                length = right - left + 1;
            }
                right++;
            }
        }
        return length;
    }
}
