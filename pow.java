import java.io.*;
import java.util.*;
public class pow
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=5,p=3,result=1;
    if(n>=0 && p==0)
    {
      result=1;
    }
    else if(n==0 && p>=0)
    {
      result=0;
    }  
    else
    {
      for(int i=1;i<=p;i++)
      {
        result =result*n;
      }
    }
    System.out.println(result);
  }
} 
