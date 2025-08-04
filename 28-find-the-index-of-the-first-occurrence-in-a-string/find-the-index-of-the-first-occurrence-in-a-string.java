class Solution {
    public int strStr(String haystack, String needle) {

        if(needle.length()>haystack.length()){
            return -1;
        }

        for(int i = 0;i<=haystack.length()-needle.length();i++){
            String newStr = haystack.substring(i);
            if(newStr.startsWith(needle)){
                return i;
            }
        }

        return -1;
        
    }
}