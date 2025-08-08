class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] newArray = new int[nums.length-k+1];
        int l = 0;
        List <Integer> deque = new ArrayList<>();
        int idx = 0;

        for(int i = 0;i<nums.length;i++){

           while(!deque.isEmpty() && deque.get(0) <= i-k){
                deque.remove(0);
           }

           while(!deque.isEmpty() && nums[deque.get(deque.size()-1)] < nums[i]){
            deque.remove(deque.size()-1);
           }

           deque.add(i);

           if(i-l+1 == k){
            newArray[idx] = nums[deque.get(0)];
            idx+=1;
            l+=1;
           }
            
        }

        return newArray;
        
    }
}