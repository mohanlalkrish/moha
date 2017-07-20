import java.util.*;
class uniq//firstrepeating in array
{
    public static void main(String args[])
    {
        String s="",s1="",s2="";
         int f=0;
        for(int i=0;i<args.length;i++)
        {
            s+=args[i];
            }
            for(int i=0;i<s.length();i++)
            {
             s1=s.replace(args[i],"");
            
            if(s1.length()==(s.length()-args[i].length()))
            {
          System.out.print(args[i]);
            }
            }

        
            
    }
}
