import java.util.*;
import java.lang.*;
class Test{
	public static void main(String e[]){
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int si=n*2-1;
	ArrayList<Integer>[] li= new ArrayList[10];	
	int i=0,j=0,sm=0;
	for(i=0;i<10;i++)
	 li[i]=new ArrayList<Integer>();
	    int a[][]= new int[n][m];
	    for(i=0;i<n;i++)
	       for(j=0;j<m;j++)
	        a[i][j]=sc.nextInt();	
	        for(i=0;i<n;i++){
	             for(j=0;j<m;j++){
	                 sm=i+j;
	                 if(sm%2==0)
	                      li[sm].add(0,a[i][j]);
	                      else
	                         li[sm].add(a[i][j]);
	             }
	               }
	               for(i=0;i<10;i++)
	                   for(j=0;j<li[i].size();j++)
	               System.out.print(li[i].get(j)+" ");
		
	}
}
