class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int j = 1;
        int zeros = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros = zeros + 1;
            } else {
                j = nums[i] * j;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            if (zeros == 0) {
                arr[k] = j / nums[k];
            } else if (zeros == 1) {
                if (nums[k] == 0) {
                    arr[k] = j;
                } else {
                    arr[k] = 0;
                }
            } else {
                arr[k] = 0;
            }
        }
        return arr;
    }
}
