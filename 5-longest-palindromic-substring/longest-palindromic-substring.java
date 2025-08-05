class Solution {
    public String longestPalindrome(String s) {



        String finalStr = "";
        String maxLengthStr = "";

        for(int i = 0;i<s.length();i++){
            String even = palindromeStr(s,i,i);
            String odd = palindromeStr(s,i,i+1);

            if(even.length()>odd.length()){
                maxLengthStr = even;
            }else{
                maxLengthStr = odd;
            }

            if(maxLengthStr.length()>finalStr.length()){
                finalStr = maxLengthStr;
            }
        }

        return finalStr;
    }

    static  String palindromeStr(String s,int left,int right){
            if(s == null ||  s.length()<1){
                return "";
            }

            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                left-=1;
                right+=1;
            }

            
                return s.substring(left+1,right);
           

        }


   

}