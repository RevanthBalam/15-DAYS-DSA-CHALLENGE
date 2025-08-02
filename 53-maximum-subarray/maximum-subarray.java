class Solution {
    public int maxSubArray(int[] nums) {

        int maxCount = Integer.MIN_VALUE;

        int count = 0;

        for(int i = 0;i<nums.length;i++){

            count+=nums[i];

            maxCount = Math.max(maxCount,count);

            if(count < 0){
                count = 0;
            }

        }

        return maxCount;
        
    }
}