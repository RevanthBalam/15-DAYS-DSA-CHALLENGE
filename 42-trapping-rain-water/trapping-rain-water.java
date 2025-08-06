class Solution {
    public int trap(int[] height) {
        int maxLeft[] = maxLeftPrefix(height);
        int maxRight[] = maxRightSuffix(height);
        int total = 0;
        
        for(int i = 0;i<height.length;i++){
             int minHeight = Math.min(maxLeft[i],maxRight[i]);

            if(height[i]<minHeight){
                total+=minHeight-height[i];
            }
        }

        return total;
        
    }

    static int[] maxLeftPrefix(int[] height){
        int[] arr = new int[height.length];
        arr[0] = 0;
        for(int i = 1;i<height.length;i++){
            arr[i] = Math.max(arr[i-1],height[i-1]);
        }

        return arr;
    }

    static int[] maxRightSuffix(int[] height){
        int[] arr =new int[height.length];
        arr[height.length-1] = 0;
        for(int i = height.length-2;i>=0;i--){
            arr[i] = Math.max(arr[i+1],height[i+1]);
        }

        return arr;
    }
}