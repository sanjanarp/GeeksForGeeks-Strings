void solve()
 {
    string str ;
      cin >> str ;
      if(str.size()%2!=0){
          cout<<"-1"<<endl;
      }
      else{
        stack<char> s;
        int unbalance =0,count =0;
        for(int i = 0 ; i<str.size() ;i++)
          {
            if(str[i] == '{')
                s.push(i);
                else
                {
                    if(s.empty())
                    unbalance++;
                    else
                    s.pop();  
                }
          }
                cout<<(unbalance +1)/2 +((s.size()+1)/2)<<endl;  
        }
}
        
