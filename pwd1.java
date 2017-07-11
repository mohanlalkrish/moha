import java.util.*;
import java.io.*;
class pwd1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String s1=s.next();
String s2=s.next();
String p=s.next(),t="";
int n=s.nextInt();
if(s1.length()>s2.length())
		{
		t=s2;
		s2=s1;
		s1=t;
		}
		else if(s1.length()==s2.length())
		{
		  if(s2.compareTo(s1)<0)
		  {
		      t=s2;
		      s2=s1;
		      s1=t;
		  }}
t="";
		  s1=s2.substring(0,1)+s1;
		  for(int i=0;i<s1.length();i++)
		  {
		 char c=s1.charAt(i);     
		 if(Character.isUpperCase(c))
		 t=t+Character.toLowerCase(c);
		 else
		 t=t+Character.toUpperCase(c);
		  }
		  int k2=((p.length()-1)-(n-1));
		  System.out.println(t+p.substring(n-1,n)+p.substring(k2,k2+1));
		      
}
}
