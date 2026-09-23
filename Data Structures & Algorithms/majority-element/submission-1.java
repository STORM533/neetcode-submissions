class Solution {
    public int majorityElement(int[] nums) {
        Map <Integer,Integer> map = new HashMap<>();
        int majority = nums.length/2; 
        if(nums.length == 1)  {
            return nums[0];
        }
        for(int i = 0;i < nums.length;i++) {
            int value = 0;
            if(map.containsKey(nums[i])) {
                value = map.get(nums[i]);
                value = value + 1;
                map.put(nums[i],value);
                if(map.get(nums[i])> majority) {
                    return nums[i];
                }
            }else {
                map.put(nums[i],value + 1);
            }
        }
        return 0;
    }   
}