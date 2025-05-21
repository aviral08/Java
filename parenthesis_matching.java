import java.util.*;
class parenthesis_matching {
    public boolean isValid(String s) {
        ArrayDeque<Character> d=new ArrayDeque<Character>();
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            if(a=='{' || a=='[' || a=='(')
            d.push(a);
            else if(a=='}'||a==']'||a==')')
            {
            if(d.isEmpty())
            return false;
            
            
            char top=d.pop();
            if((a==')'&& top!='(')||
            (a==']'&& top!='[') ||
            (a=='}'&& top!='{'))
            return false;
            }


        }
        return d.isEmpty();
    }
}