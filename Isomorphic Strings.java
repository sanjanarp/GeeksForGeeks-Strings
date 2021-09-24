 public static boolean areIsomorphic(String s1,String s2)
    {
        int n = s1.length(), m= s2.length();
        HashMap<Character,Character> map = new HashMap<>();
        if(n!=m) return false;
        for(int i=0;i<n;i++){
            if(map.containsKey(s1.charAt(i))){
                if(map.get(s1.charAt(i))!=s2.charAt(i))
                return false;
            }
            else if(map.containsValue(s2.charAt(i)){
                  return false;    
            }
            else map.put(s1.charAt(i),s2.charAt(i));
        }
        
        return true;        
    }
}
