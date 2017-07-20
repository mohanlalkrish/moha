import java.util.*;
class arr1
{
    public static void main(String args[])
    {Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            for(int k=0;k<n;k++)
            {
                if((arr[i]+arr[j]=arr[k]))
                {
                if((i!=j)&&(j!=k)&&(k!=i))
                {
                System.out.print(arr[i]+"+"+arr[j]+"="+arr[k]);
                }
                }
            }
        }
    }
        
    }
}
