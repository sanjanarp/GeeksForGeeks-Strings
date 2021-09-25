class Solution {
    public List<List<String>> Anagrams(String[] s) {
        List<List<String>> res = new ArrayList<>(); 
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(int i=0;i<s.length;i++){
            char[] temp = s[i].toCharArray();
            Arrays.sort(temp);
              if(!map.containsKey(String.valueOf(temp))){
                  //if map contains the required string, then keep adding in all the variations of that string available in the given list as values in the map
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
