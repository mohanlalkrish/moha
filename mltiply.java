import java.util.*;
import java.io.*;
class mltiply
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt(),sed=1,b=n;
while(n>0)
{
int a=n%10;
sed=sed*a;
n/=10;
}
System.out.print(sed*b);

}
}
