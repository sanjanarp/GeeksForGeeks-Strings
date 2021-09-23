class Solution {
    
    public int romanToDecimal(String str) {
        // code here
        int value=0;
        for(int i=0;i<str.length()-1;i++){
            if(val(str.charAt(i)) >= val(str.charAt(i+1))){
                value+= val(str.charAt(i));
              
            } else {
                value-= val(str.charAt(i));
               
            }
        }
        return value + val(str.charAt(str.length()-1));
    }
    
    int val(char v){
        if(v == 'I') return 1;
        else if(v == 'V')return 5;
        else if(v == 'X')return 10;
        else if(v == 'L')return 50;
        else if(v == 'C')return 100;
        else if(v == 'D')return 500;
        else if(v == 'M')return 1000;
        return -1;
        
    }
}
