import java.util.*;
class array
{
    public static void main(String args[])
    {
        int l=args.length;
        String a="",b="";
            Arrays.sort(args);
            for(int i=0;i<l;i++)
            {
                StringBuffer sb=new StringBuffer(args[i]);
            a+=String.valueOf(sb.reverse());
              //System.out.print(a);
            }
          
            for(int i=0;i<a.length();i+=3)
            {
            if(i<(a.length()-3))
            {
                String c=a.substring(i,i+3);
                b+=c+",";
            }
            else
            {
                String c=a.substring(i);
                b+=c;
            }
            
  
            }
            StringBuffer sb=new StringBuffer(b);
                  System.out.print(sb.reverse());
    }
}
