class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> hm = new HashMap<>();
        
        if(strs.length == 0){
            List<String> il = new ArrayList<>();
            List<List<String>> fl = new ArrayList<>();
            fl.add(il);
            return fl;
        }

        for(int i = 0;i<strs.length;i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String words = new String(charArray);

        if(!hm.containsKey(words)){
            hm.put(words,new ArrayList<>());
        }
           
            hm.get(words).add(strs[i]);
          
        }

        List<List<String>> fl = new ArrayList<>();

        Set<String> allValues = hm.keySet();

        System.out.println(allValues);

        for(String l:allValues){
            System.out.println(l);


            fl.add(hm.get(l));
        }

        return fl;
         
        
    }
}