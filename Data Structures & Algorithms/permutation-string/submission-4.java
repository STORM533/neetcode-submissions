class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0;
        int right = s1.length() - 1;
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr2[s1.charAt(i) - 'a']++;
            arr1[s2.charAt(i) - 'a']++;
        }
        while (right < s2.length()) {
            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
            arr1[s2.charAt(left) - 'a']--;
            left++;
            right++;
            if (right < s2.length()) {
                arr1[s2.charAt(right) - 'a']++;
            }
        }
        return false;
    }
}