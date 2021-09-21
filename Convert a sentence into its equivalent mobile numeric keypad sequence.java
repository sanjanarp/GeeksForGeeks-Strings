class Solution 
{ 
    String printSequence(String S) 
    { 
        String[] arr = {"2","22","222",
                        "3","33","333",
                        "4","44","444",
                        "5","55","555",
                        "6","66","666",
                        "7","77","777","7777",
                        "8","88","888",
                        "9","99","999","9999"
                       };
        String res="";
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == ' '){
                res+="0";
            } else {
                res+= arr[S.charAt(i) -'A']; 
              //ASCII values for alphabets start from 65 (A). ASCII values of characters in the given string are subtracted by 65, so as to match the array index of arr.
            }
        }
        
        return res;
        
    }
}
