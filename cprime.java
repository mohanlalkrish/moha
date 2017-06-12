import java.util.*;
class cprime
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int n1=s.nextInt();
int c=0;
for(int i=n;i<n1;i++)
{
if(i%2!=0 && i%3!=0 && i%5!=0)
c++;
}
System.out.println(c);
}
}
