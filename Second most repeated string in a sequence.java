class Solution
{
    String secFrequent(String arr[], int N)
    {
        // your code here
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            if(map.containsKey(arr[i])){
                int a = map.get(arr[i]);
                map.put(arr[i], a+1);
            } else
            map.put(arr[i],1);
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int b : map.values()){
            al.add(b);
        }
        
        Collections.sort(al);
        int val = al.get(al.size()-2);
        String result="";
        
        for(Map.Entry<String, Integer> entry: map.entrySet()) {

      if(entry.getValue() == val) {
           result = entry.getKey();
         }
        }
        
        return result;
    }
}
