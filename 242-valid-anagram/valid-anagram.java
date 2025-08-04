class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();

        for(int i = 0;i<s.length();i++){
            if(hm1.containsKey(s.charAt(i))){
                hm1.put(s.charAt(i),hm1.get(s.charAt(i))+1);
            }else{
                hm1.put(s.charAt(i),1);
            }
        }
        for(int i = 0;i<t.length();i++){
            if(hm1.containsKey(t.charAt(i))){
                if(hm1.get(t.charAt(i))==1){
                    hm1.remove(t.charAt(i));
                }else{
                    hm1.put(t.charAt(i),hm1.get(t.charAt(i))-1);
                }
            }else{
                return false;
            }
        }


        if(hm1.size()==0){
            return true;
        }
        
        
        return false;



        
    }
}