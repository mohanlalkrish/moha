import java.util.*;
class num
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
String s1=String.valueOf(a);
char ch[]=s1.toCharArray();
Arrays.sort(ch);
int l=s1.length();
int c=l-b;
for(int i=0;i<c;i++)
{
System.out.print(ch[i]);
}
}
}
