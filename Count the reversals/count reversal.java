class Sol
{
    int countRev (String s)
    {
        // your code here  
        if(s.length()%2!=0) return -1;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) //remove all balanced brackets
         {
            if(!stack.isEmpty() && s.charAt(i) == '}' && stack.peek()== '{'){
                stack.pop();
            } else
            stack.push(s.charAt(i));
         }
        
        int count=0; 
        while(!stack.isEmpty()){
          char j = stack.pop();
          char i = stack.pop();
          if(j!='}') count++; // if the top most element in the stack is not equal to '}'
          if(i!='{') count++; // and if 2nd top most is not equal to '{' , that is, if these two do not form a balanced bracket pair, then increase count because theyhave to be reversed.
        }
        return count;
    }
}
