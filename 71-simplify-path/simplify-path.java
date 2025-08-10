class Solution {
    public String simplifyPath(String path) {
        String finalStr = "/";
        String[] arr = path.split("/");

        Stack<String> st = new Stack<>();
        

        for(int i =1;i<arr.length;i++){
            if(arr[i].equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else if(arr[i].equals(".") || arr[i].equals("")){
                continue;
            }else{
                st.push(arr[i]);
            }
        }

        System.out.println(st);

        for(int i = 0;i<st.size();i++){
            finalStr += st.get(i);
            if(i!=st.size()-1){
                finalStr += "/";
            }
        }
       
        return finalStr;

    }
}