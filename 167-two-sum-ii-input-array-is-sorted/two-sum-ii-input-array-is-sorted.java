class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int minIndex = 0;
        int maxIndex = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<numbers.length;i++){
            int num = target-numbers[i];
            if(hm.containsKey(num)){
                minIndex = Math.min(hm.get(num),i);
                maxIndex = Math.max(hm.get(num),i);
            }else{
                hm.put(numbers[i],i);
            }
        }

        return new int[]{minIndex+1,maxIndex+1};
    }
}