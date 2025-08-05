class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> st = new ArrayList<>();

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                st.add(s.charAt(i));
            }else{
                if(s.charAt(i) == ')'){
                    if(!st.isEmpty() && st.get(st.size()-1)== '('){
                        st.remove(st.size()-1);
                    }else{
                        return false;
                    }
                }else if(s.charAt(i) == ']'){
                    if(!st.isEmpty() && st.get(st.size()-1)== '['){
                        st.remove(st.size()-1);
                    }else{
                        return false;
                    }
                }else{
                    if(!st.isEmpty() && st.get(st.size()-1)== '{'){
                        st.remove(st.size()-1);
                    }else{
                        return false;
                    }
                }
            }
        }

        if(st.size()==0){
            return true;
        }else{
            return false;
        }


    }
}