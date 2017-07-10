import java.io.*;
import java.util.*;
class work
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
if(s.equalsIgnoreCase("monday")||s.equalsIgnoreCase("tuesday")||s.equalsIgnoreCase("wednesday")||s.equalsIgnoreCase("thursday")||s.equalsIgnoreCase("friday")||s.equalsIgnoreCase("saturday"))
{
  System.out.println("true");
}
else
  System.out.println("false");
}
}
