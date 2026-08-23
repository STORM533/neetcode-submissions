class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            st.add(nums[i]);
        }
        for(Integer num: st) {
            if(!st.contains(num-1)){
                int max = 1;
                while(st.contains(num+max)) {
                    max++;
                }
                count = Math.max(count,max);
            }
        }
        return count;
    }
}
