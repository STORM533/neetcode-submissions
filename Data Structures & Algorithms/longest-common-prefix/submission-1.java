class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int left = 0;
            while(left < Math.min(str.length(), strs[i].length())) {
                if (str.charAt(left) != strs[i].charAt(left)) {
                    break;
                }
                left++;
            }
            str = str.substring(0, left);
        }
        return str;
    }
}