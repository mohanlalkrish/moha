import java.util.*;
class arruniq//firstrepeating in array
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
            
            if(s1.length()<=(s.length()-args[i].length()*2))
            {
                s2=args[i];
                f=1;
                break;
            }
            }
            if(f==1)
        System.out.print(s2);
        
            
    }
}



