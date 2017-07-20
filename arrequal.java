
import java.util.*;
class arrequal {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		int n;
		n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j]){
					System.out.print(a[i]);
				}}}
		
	}

}
