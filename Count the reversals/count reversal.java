class Sol
{
    int countRev (String s)
    {
        // your code here  
        if(s.length()%2!=0) return -1;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && s.charAt(i) == '}' && stack.peek()== '{'){
                stack.pop();
            } else
            stack.push(s.charAt(i));
        }
        int count=0;
        
        while(!stack.isEmpty()){
          char j = stack.pop();
          char i = stack.pop();
          if(j!='}') count++;
          if(i!='{') count++;
        }
        return count;
    }
}
