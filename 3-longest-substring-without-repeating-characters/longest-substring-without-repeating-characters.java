class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length()==0){
            return 0;
        }
        int maxLength = Integer.MIN_VALUE;
        int leftPointer = 0;
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            while(hs.contains(ch)){
                hs.remove(s.charAt(leftPointer));
                leftPointer+=1;
            }

            hs.add(ch);

            maxLength = Math.max(hs.size(),maxLength);
        }

        return maxLength;
    }
}