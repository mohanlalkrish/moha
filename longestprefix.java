import java.util.*;
import java.io.*;
class longestprefix
{
public static void main(String ar[])throws Exception
{
Scanner s=new Scanner(System.in);
int n,j;
n=s.nextInt();
String a[]=new String[100];
for(int i=0;i<n;i++)
{
a[i]=s.next();
}
String l;
if(a.length>0)
l=a[0];
for(int i=1;i<a.length;i++)
{
String check=a[i];
for(j=0;j<Math.min(l.length(),a[i].length());j++)
{
if(l.charAt(j)!=check.charAt(j))
break;
}
l=a[i].substring(0,j);
}
System.out.println("longest prefix is:"+l);
}
}
