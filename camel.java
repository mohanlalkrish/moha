import java.io.*;
import java.util.*;
class camel
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String st[]=s.split(" ");
for(int i=0;i<st.length;i++)
{
String str=st[i];
String s1=String.valueOf(str.charAt(0)).toUpperCase();
System.out.print(s1+str.substring(1)+" ");
}
}
}
