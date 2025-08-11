class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int finalMaxWater = Integer.MIN_VALUE;

        while(start<end){
            int minHeight = Math.min(height[start],height[end]);
            finalMaxWater = Math.max((minHeight) * (end-start),finalMaxWater);
            if(height[start] <= height[end]){
                start+=1;
            }else{
                end -= 1;
            }
        }
        return finalMaxWater;
    }
}