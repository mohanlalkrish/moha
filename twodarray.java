import java.util.*;
class twodarray
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[][]=new int[4][2];
for(int i=0;i<4;i++)
{
for(int j=0;j<2;j++)
{
a[i][j]=s.nextInt();
}
}
if(a[0][1]==a[1][0]&&a[2][0]==a[3][0]&&a[0][1]==a[3][1]&&a[1][1]==a[2][1])
System.out.println("Square");
else
System.out.print("not square");
}
}
