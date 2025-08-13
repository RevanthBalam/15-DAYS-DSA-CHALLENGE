class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            int total  = 1;
            for(int j = i;j<nums.length;j++){
                total = total*nums[j]; 
                max = Math.max(total,max);
            }

        }

        return max;
    }
}