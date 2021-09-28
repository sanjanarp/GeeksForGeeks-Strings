class Solution{
    static String lookandsay(int n) {
      if(n==1) return "1";
      if(n==2) return "11";
      String res="11";
      for(int i=3;i<=n;i++){
          int count =1;
          String str ="";
          for(int j=0; j<res.length();j++){
              if(j!=res.length()-1 && (res.charAt(j) == res.charAt(j+1))){
                  count++;    
              } else {
                  str += count;
                  str+= res.charAt(j);
                  count =1;
              }
          }
          res = str;   
      }
      return res;
    }
}
