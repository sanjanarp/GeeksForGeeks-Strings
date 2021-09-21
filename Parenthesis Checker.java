class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        int n = x.length();
        if(n%2!=0) return false;
        Stack<Character> s = new Stack<Character>();
        for(int i=0;i<n;i++){
        if(!s.isEmpty() && x.charAt(i) == ')' &&  s.peek()== '('){
            s.pop();
        }else if( !s.isEmpty() && x.charAt(i) == '}' &&  s.peek()== '{'  ){
            s.pop();
        }else if(!s.isEmpty() && x.charAt(i) == ']' &&  s.peek()== '['  ){
            s.pop();
        } else s.push(x.charAt(i));
    }
    
   return s.isEmpty()? true: false;
      
    }
}
