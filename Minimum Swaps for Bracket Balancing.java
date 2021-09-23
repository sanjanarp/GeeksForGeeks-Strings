class Solution{
    static int minimumNumberOfSwaps(String S){
        // code here
        int count=0,open=0,close=0;
        for(int i=0;i<S.length();i++){  
            if(S.charAt(i)==']')
              /*if the character is a closing bracket,
              and if there is an open bracket already counted, 
              then it forms a pair so, the pair can be removed from count.
              This is simply done by decrementing the value of open brackets by 1. 
              If open brackets count is 0, then increment the number of closing brackets */
            {
                if(open>0)
                    open--;
                else close++;
            } 
            if(S.charAt(i)=='[')
              /*if the character is an opening bracket,
              and if there is a closing bracket already counted, 
              then it forms a pair so, the pair can be removed from count.
              This is simply done by decrementing the value of closing brackets by 1. 
              If closing brackets count is 0, then increment the number of opening brackets.
              The minimum number of swaps count is given by adding the number of closing brackets.*/
            {
               count+=close;
              if(close>0)
                  close--;
               else open++;
            }
        }
       
        return count;  
    }
}
