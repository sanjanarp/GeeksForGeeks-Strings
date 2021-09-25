class Solution {
    public List<List<String>> Anagrams(String[] s) {
        // Code here
        List<List<String>> res = new ArrayList<>(); 
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(int i=0;i<s.length;i++){
            char[] temp = s[i].toCharArray();
            Arrays.sort(temp);
              if(!map.containsKey(String.valueOf(temp))){
                 ArrayList<String> al = new ArrayList<>();
                 al.add(s[i]);
                map.put(String.valueOf(temp),al);
            } else {
                map.get(String.valueOf(temp)).add(s[i]);
            }
        }  
        for(String st : map.keySet()){
            res.add(map.get(st));     
        }
      return res;  
    }
}
